package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private Connection con;
    private final String user = "root";
    private final String password = "Gabri123!";
    private final String url = "jdbc:mysql://localhost:3306/academia";

    //Retorna uma conexao
    public Connection getConnection() throws SQLException {
        con = DriverManager.getConnection(url, user, password);
        return con;
    }
}
