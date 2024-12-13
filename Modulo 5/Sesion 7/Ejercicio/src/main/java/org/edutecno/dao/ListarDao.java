package org.edutecno.dao;

import org.edutecno.bddCon.AdministradorConexion;
import org.edutecno.dao.interfaces.ListarDaoImp;
import org.edutecno.dto.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListarDao implements ListarDaoImp {
    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        String query = "SELECT * FROM usuario";

        try (Connection connection = AdministradorConexion.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("ID_USUARIO"));
                usuario.setNombre(rs.getString("NOMBRE"));
                usuario.setClave(rs.getString("CLAVE"));
                usuario.setRut(rs.getInt("RUT"));
                usuario.setDv(rs.getString("DV").charAt(0));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usuarios;
    }
}
