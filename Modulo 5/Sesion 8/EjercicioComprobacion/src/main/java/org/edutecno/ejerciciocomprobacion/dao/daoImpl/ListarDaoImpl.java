package org.edutecno.ejerciciocomprobacion.dao.daoImpl;

import org.edutecno.ejerciciocomprobacion.connection.AdministradorConexion;
import org.edutecno.ejerciciocomprobacion.dao.ListarDao;
import org.edutecno.ejerciciocomprobacion.dto.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ListarDaoImpl implements ListarDao {

    @Override
    public List<Usuario> listarUsuario() {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "select * from usuario";

        try (Connection connection = AdministradorConexion.getConnection();
             PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery()){
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id_Usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setClave(rs.getString("clave"));
                usuario.setRut(rs.getInt("rut"));
                usuario.setDv(rs.getString("dv").charAt(0));
                usuarios.add(usuario);
            }
        } catch(Exception e){

        }
        return usuarios;
    }
}
