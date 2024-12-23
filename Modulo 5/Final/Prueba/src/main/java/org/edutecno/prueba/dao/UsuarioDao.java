package org.edutecno.prueba.dao;

import org.edutecno.prueba.dto.Usuario;

public interface UsuarioDao {
    public boolean registrarUsuario(Usuario usuario);
    public boolean modificarUsuario(Usuario usuario);
}
