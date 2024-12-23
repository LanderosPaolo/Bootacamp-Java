package org.edutecno.prueba.service;

import org.edutecno.prueba.procesaconexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioService {
    public boolean validarUsuario(String username, String password) {
        boolean valid = false;
        String sql = "select * from usuarios where username=? and password=?";

        try(Connection conn = Conexion.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                valid = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valid;
    }
}
