package org.edutecno.prueba.procesaconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/finalmodulo";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Error al conectar con la base de datos", ex);
        }
    }
}
