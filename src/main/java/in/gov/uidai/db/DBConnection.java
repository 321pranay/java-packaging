package in.gov.uidai.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String URL = System.getProperty("JDBC_URL");
        String Username = System.getProperty("SQL_username");
        String Password = System.getProperty("SQL_password");
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection(URL,Username,Password);
        return conn;
    }
}
