package creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static volatile ConnectionPool instance;
    private final int poolSize = 2;
    private final List<DBConnection> pool;

    private ConnectionPool() {
        pool = new ArrayList<>();
        for (int i = 0; i < poolSize; ++i) {
            pool.add(new DBConnection(i + 1));
        }
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }

    public DBConnection getConnection() {
        if (!pool.isEmpty()) {
            return pool.remove(0);
        }
        return new DBConnection(1);
    }

    public void releaseConnection(final DBConnection dbConnection) {
        if (pool.size() < poolSize) {
            pool.add(dbConnection);
        } else {
            dbConnection.close();
        }
    }
}
