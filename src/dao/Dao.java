package dao;

import java.sql.*;
import java.util.List;

public abstract class Dao<T> {
    protected static Connection connection;

    public Dao() {
        this.connection = DatabaseConnection.getConnection();
    }

    protected static Statement createStatement() throws SQLException {
        return connection.createStatement();
    }

    public abstract void add(T entity) throws SQLException;

    public abstract T get(int id) throws SQLException;

    public abstract List<T> getAll() throws SQLException;

    public abstract void update(T entity) throws SQLException;

    public abstract void delete(int id) throws SQLException;

    protected static PreparedStatement prepareStatement(String sql, Object... parameters) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(sql);
        for (int i = 0; i < parameters.length; i++) {
            stmt.setObject(i + 1, parameters[i]);
        }
        return stmt;
    }

    protected T getSingleResult(ResultSet rs) throws SQLException {
        // Método a ser implementado nas subclasses
        return null;
    }

    protected List<T> getResultList(ResultSet rs) throws SQLException {
        // Método a ser implementado nas subclasses
        return null;
    }
}
