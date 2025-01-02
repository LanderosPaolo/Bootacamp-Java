package org.edutecno.prueba.service;

import org.edutecno.prueba.model.Usuario;

import java.util.List;

public interface UsuarioService {
    boolean registrarUsuario(Usuario usuario);
    String validarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    boolean eliminarUsuario(int id);
    boolean actualizarUsuario(Usuario usuario);
}