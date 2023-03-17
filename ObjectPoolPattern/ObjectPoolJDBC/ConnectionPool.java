package ObjectPoolPattern.ObjectPoolJDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionPool {

    private ObjectPool<Connection> connectionPool;

    public ConnectionPool(String url, Properties properties, int maxSize) {
        connectionPool = new ObjectPool<>(maxSize, new ConnectionFactory(url, properties));
    }

    public Connection getConnection() throws Exception {
        return connectionPool.borrowObject();
    }

    public void releaseConnection(Connection connection) {
        connectionPool.returnObject(connection);
    }

    private static class ConnectionFactory implements ObjectPool.ObjectFactory<Connection> {

        private String url;
        private Properties properties;

        public ConnectionFactory(String url, Properties properties) {
            this.url = url;
            this.properties = properties;
        }

        @Override
        public Connection createObject() {
            try {
                return DriverManager.getConnection(url, properties);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void cleanUp() {
    }
}