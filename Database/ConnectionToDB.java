package Database;

import java.sql.*;

public class ConnectionToDB{
    public Connection checkConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/endterm";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(connectionUrl, "postgres", "postgres");
            System.out.println("Success!!");
            return connection;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}