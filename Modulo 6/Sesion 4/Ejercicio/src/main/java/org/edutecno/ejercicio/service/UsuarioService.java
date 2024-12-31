package org.edutecno.ejercicio.service;

import org.edutecno.ejercicio.model.Usuario;

public interface UsuarioService {
    boolean registrarUsuario(Usuario usuario);
    String validarUsuario(Usuario usuario);
}
