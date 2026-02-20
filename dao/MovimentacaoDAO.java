package dao;

import model.Movimentacao;
import util.conexao.Conexao;

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

            stmt.setInt(1, m.getProduto().getId());
            stmt.setSting(2, m.getTipo());
            stmt.setInt(3, m.getQuantidade());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(m.getDataHora()));

            stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}