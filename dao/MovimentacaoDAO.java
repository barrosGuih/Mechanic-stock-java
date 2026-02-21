package dao;

import model.Movimentacao;
import util.conexao.Conexao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MovimentacaoDAO {
    public void inserir(Movimentacao m) {
        String sql = """
            INSERT INTO movimentacoes (produto_id, tipo, quantidade, data_hora)
            VALUES(?,?,?,?)
        """;;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, m.getProdutoId());
            stmt.setString(2, m.getTipo());
            stmt.setInt(3, m.getQuantidade());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(m.getDataHora()));

            stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public void listar(){
        String sql = """
            SELECT m.id, p.nome, m.tipo, m.quantidade, m.data_hora
            FROM movimentacoes m
            JOIN produtos p ON p.id = m.produto_id
            ORDER BY m.data_hora DESC            
            """;;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){

                while(rs.next()){
                    System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("nome") + " | " + 
                        rs.getInt("quantidade") + " | " +
                        rs.getTimestamp("data_hora")
                    );
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}