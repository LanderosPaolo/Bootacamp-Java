package org.edutecno.prueba.dao;

import org.edutecno.prueba.dto.Usuario;

import java.util.List;

public interface UsuarioDao {
    public boolean registrarUsuario(Usuario usuario);
    public boolean modificarUsuario(Usuario usuario);
    public List<Usuario> buscarUsuario();
    public boolean eliminarUsuario(int id);
    public Usuario obtenerAnimal(Usuario usuario);
}
