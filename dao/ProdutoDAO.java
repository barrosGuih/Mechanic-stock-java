package dao;

import model.Produto;
import util.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDAO {
    public void inserir(Produto p) {
        String sql = "INSERT INTO produtos (id, nome, quantidade) VALUES (?,?,?)";

        try (Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setInt(3, p.getQuantidade());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listar(){
        String sql = "SELECT * FROM produtos";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){

                while(rs.next()){
                    System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("nome") + " |  Qtd: " + 
                        rs.getInt("quantidade")
                    );
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}