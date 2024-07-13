package singleton;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool {

    private static ConnectionPool cp;
    private static int maxConnections;
    private static int availableConnections;

    private List<DatabaseConnection> connections = new ArrayList();

    private ConnectionPoolImpl() {

    }

    @Override
    public void initializePool() {
        connections.clear();

        for(int i = 0; i<maxConnections; i++) {
            connections.add(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        for(int i =0; i<maxConnections; i++) {
            if(!connections.get(i).isBeingUsed) {
                availableConnections --;
                return connections.get(i);
            }
        }

        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connection.isBeingUsed = false;
        availableConnections++;
    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableConnections;
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }

    public static ConnectionPool getInstance(int maxConnectionss) {
        if(cp == null) {
            synchronized(ConnectionPoolImpl.class) {
                if(cp == null) {
                    maxConnections = maxConnectionss;
                    availableConnections = maxConnectionss;
                    cp = new ConnectionPoolImpl();
                }
            }
        }

        return cp;
    }

    public static void resetInstance() {
        cp = null;
    }
}