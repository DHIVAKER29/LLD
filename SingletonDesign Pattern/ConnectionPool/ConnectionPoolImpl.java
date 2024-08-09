package com.assignments.question;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPoolImpl implements ConnectionPool {

    private static ConnectionPool instance = null;
    private final int maxConnections;
    private final BlockingQueue<DatabaseConnection> connectionQueue;

    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;
        connectionQueue = new ArrayBlockingQueue<>(maxConnections);
        initializePool();
    }

    public static ConnectionPool getInstance(int maxConnections) {
        if (instance == null) {
            instance = new ConnectionPoolImpl(maxConnections);
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            DatabaseConnection connection = createConnection();
            connectionQueue.offer(connection);
        }
    }

    private DatabaseConnection createConnection() {
        return new DatabaseConnection();
    }

    @Override
    public DatabaseConnection getConnection() {
        try {
            return connectionQueue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Error getting connection", e);
        }
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        try {
            if (connection != null) {
                connectionQueue.offer(connection);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error releasing connection", e);
        }
    }

    @Override
    public int getAvailableConnectionsCount() {
        return connectionQueue.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
}

