package org.edutecno.ejercicio.service.impl;

import org.edutecno.ejercicio.model.Usuario;
import org.edutecno.ejercicio.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final List<Usuario> usuariosRegistrados = new ArrayList<>();

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        String validar = validarUsuario(usuario);
        if (validar != null) {
            usuariosRegistrados.add(usuario);
            return true;
        }
        return false;
    }

    @Override
    public String validarUsuario(Usuario usuario) {
        if(!usuario.getNombre().matches("^[A-Za-z]+$")) {
            return "El nombre solo debe contener letras";
        }

        if(!usuario.getApellido().matches("^[A-Za-z]+$")) {
            return "El apellido solo debe contener letras";
        }

        if(!usuario.getUsername().matches("^[A-Za-z0-9]+$")) {
            return "El nombre solo debe contener letras y números, SIN ESPACIOS";
        }

        if(usuariosRegistrados.stream().anyMatch(u -> u.getUsername().equals(usuario.getUsername()))) {
            return "El usuario ya existe";
        }

        if (!usuario.getPassword().matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{10,}$")) {
            return "La contraseña debe tener al menos 10 caracteres, 1 símbolo, 1 número y 1 mayúscula";
        }

        if (!usuario.getEmail().matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            return "El email no es válido.";
        }

        return "";
    }
}
