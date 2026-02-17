import java.sql.Connection;
import java.sql.DriverManager;

public class TesteConexao {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/mechanic_stock?useSSL=false&serverTimezone=UTC",
            "root",
            "Gui87404242@"
        )) {
            System.out.println("🔥 CONECTADO COM SUCESSO 🔥");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
