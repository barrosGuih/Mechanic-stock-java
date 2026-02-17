import util.conexao;
import java.sql.Connection;
import java.sql.SQLException;

public class MainTeste {
    public static void main(String[] args) {
        try (Connection conn = conexao.conectar()) {
            System.out.println("Conexão OK!");
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão");
            e.printStackTrace();
        }
    }
}
