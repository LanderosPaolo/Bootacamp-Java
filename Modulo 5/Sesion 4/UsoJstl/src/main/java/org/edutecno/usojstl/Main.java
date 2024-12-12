package org.edutecno.usojstl;

import org.edutecno.usojstl.models.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DatabaseConnection.getConnection()) {
            if(connection != null) {
                System.out.println("Conexion exitosa");
            } else {
                System.out.println("No se puede conectar con la base de datos");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
