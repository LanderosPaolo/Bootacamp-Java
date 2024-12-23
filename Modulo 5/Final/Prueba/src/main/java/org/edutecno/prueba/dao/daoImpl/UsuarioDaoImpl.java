package org.edutecno.prueba.dao.daoImpl;

import org.edutecno.prueba.dao.UsuarioDao;
import org.edutecno.prueba.dto.Usuario;
import org.edutecno.prueba.procesaconexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO USUARIOS (ID, NOMBRE, USERNAME, EMAIL, FECHA_NACIMIENTO, PASSWORD) VALUES (USUARIOS_SEQ.NEXTVAL, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getUsername());
            stmt.setString(3, usuario.getEmail());
            stmt.setDate(4, usuario.getFechaNacimiento());
            stmt.setString(5, usuario.getPassword());

            int filasInsertadas = stmt.executeUpdate();
            return filasInsertadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean modificarUsuario(Usuario usuario) {
        String sql = "UPDATE USUARIOS SET NOMBRE = ?, USERNAME = ?, EMAIL = ?, FECHA_NACIMIENTO = ?, PASSWORD = ? WHERE ID = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getUsername());
            stmt.setString(3, usuario.getEmail());
            stmt.setDate(4, usuario.getFechaNacimiento());
            stmt.setString(5, usuario.getPassword());
            stmt.setInt(6, usuario.getId());

            int filasActualizadas = stmt.executeUpdate();
            return filasActualizadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
