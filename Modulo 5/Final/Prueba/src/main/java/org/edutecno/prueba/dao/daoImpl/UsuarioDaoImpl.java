package org.edutecno.prueba.dao.daoImpl;

import org.edutecno.prueba.dao.UsuarioDao;
import org.edutecno.prueba.dto.Horoscopo;
import org.edutecno.prueba.dto.Usuario;
import org.edutecno.prueba.procesaconexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (NOMBRE, USERNAME, EMAIL, FECHA_NACIMIENTO, PASSWORD) VALUES (?, ?, ?, ?, ?)";
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
        String sql = "UPDATE usuarios SET NOMBRE = ?, USERNAME = ?, EMAIL = ?, FECHA_NACIMIENTO = ?, PASSWORD = ? WHERE ID = ?";
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

    @Override
    public List<Usuario> buscarUsuario() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Usuario usuario = new Usuario(
                            rs.getInt("ID"),
                            rs.getString("NOMBRE"),
                            rs.getString("USERNAME"),
                            rs.getString("EMAIL"),
                            rs.getDate("FECHA_NACIMIENTO"),
                            rs.getString("PASSWORD"),
                            rs.getString("ANIMAL"));
                    listaUsuarios.add(usuario);
                    System.out.println("Usuario ID: " + usuario.getId() + " Nombre: " + usuario.getNombre());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    @Override
    public boolean eliminarUsuario(int id) {
        String sql = "DELETE FROM usuarios Where id = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int affectedRows = ps.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Usuario obtenerAnimal(Usuario usuario) {
        HoroscopoDaoImpl horoscopoDao = new HoroscopoDaoImpl();
        List<Horoscopo> listaHoroscopo = horoscopoDao.obtenerHoroscopo();
        Horoscopo horoscopo = null;
        for (Horoscopo temp : listaHoroscopo) {
            if (usuario.getFechaNacimiento().after(temp.getFechaInicio()) && usuario.getFechaNacimiento().before(temp.getFechaFin())) {
                horoscopo = temp;
            } else if (usuario.getFechaNacimiento().equals(temp.getFechaInicio()) || usuario.getFechaNacimiento().equals(temp.getFechaFin())) {
                horoscopo = temp;
            }
        } if (horoscopo != null) {
            usuario.setAnimal(horoscopo.getAnimal());
        }
        return usuario;
    }
}