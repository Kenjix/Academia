package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private Connection con;    
    private final String user = "root";
    private final String password = "laboratorio";
    private final String url = "jdbc:mysql://localhost:3306/aula03agenda";

    //Retorna uma conexao
    public Connection getConnection() {
        try {            
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            System.out.println("ERRO DE CONEXÃO " + e);
            return null;
        }
    }
}
