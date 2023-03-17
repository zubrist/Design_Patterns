package ObjectPoolPattern.ObjectPoolJDBC;

import java.sql.Connection;
//import java.sql.SQLException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        // Set up the database properties
        Properties properties = new Properties();
        properties.setProperty("user", "username");
        properties.setProperty("password", "password");

        // Create a connection pool with a maximum size of 10
        ConnectionPool connectionPool = new ConnectionPool("jdbc:mysql://localhost:5500/mydatabase", properties, 10);

        try {
            // Borrow a connection from the pool
            Connection connection = connectionPool.getConnection();

            // Use the connection to perform database operations
            // ...

            // Return the connection to the pool
            connectionPool.releaseConnection(connection);
        } catch (Exception e) {
            // Handle any exceptions
            e.printStackTrace();
        } finally {
            // Clean up the connection pool
            connectionPool.cleanUp();
        }
    }
}