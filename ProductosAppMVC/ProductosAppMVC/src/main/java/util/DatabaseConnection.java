package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/productos_venta";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static void createUsersTable() {
        String sql = "CREATE TABLE users(" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "username VARCHAR(50) NOT NULL," +
                "password VARCHAR(50) NOT NULL," +
                ");";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            // Crear la tabla de usuarios
            stmt.execute(sql);
            System.out.println("Tabla 'users' creada correctamente en la base de datos SQLite.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
