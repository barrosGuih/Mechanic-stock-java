package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mechanic_stock?useSSL=false&serverTimezone=UTC";
    
    private static  final String USER = "root";

    private static final String PASSWORD = "Gui87404242@";

    public static Connection conectar(){
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao conectar no banco", e);
        }
    }
}