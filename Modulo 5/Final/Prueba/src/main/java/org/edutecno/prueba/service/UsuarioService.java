package org.edutecno.prueba.service;

import org.edutecno.prueba.dto.Usuario;
import org.edutecno.prueba.procesaconexion.Conexion;

import java.sql.*;

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

    public Usuario obtenerUsuarioPorUsername(String username) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuarios WHERE username=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                String email = rs.getString("EMAIL");
                Date fechaNacimiento = rs.getDate("FECHA_NACIMIENTO");
                String password = rs.getString("PASSWORD");
                String animal = rs.getString("ANIMAL");

                usuario = new Usuario(id, nombre, username, email, fechaNacimiento, password, animal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
}

