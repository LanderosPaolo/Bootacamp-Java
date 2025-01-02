package org.edutecno.prueba.service.impl;

import org.edutecno.prueba.model.Usuario;
import org.edutecno.prueba.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final List<Usuario> usuariosRegistrados = new ArrayList<>();
    private int aumentarId = 1;

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        String validar = validarUsuario(usuario);
        if (validar.isEmpty()) {
            usuario.setId(aumentarId++);
            usuariosRegistrados.add(usuario);
            return true;
        }
        return false;
    }

    @Override
    public String validarUsuario(Usuario usuario) {
        if (!usuario.getNombre().matches("^[A-Za-z]+$")) {
            return "El nombre solo debe contener letras";
        }
        if (!usuario.getApellido().matches("^[A-Za-z]+$")) {
            return "El apellido solo debe contener letras";
        }
        if (!usuario.getUsername().matches("^[A-Za-z0-9]+$")) {
            return "El username solo debe contener letras y números, sin espacios";
        }
        if (usuariosRegistrados.stream().anyMatch(u -> u.getUsername().equals(usuario.getUsername()))) {
            return "El username ya existe";
        }
        if (!usuario.getPassword().matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{10,}$")) {
            return "La contraseña debe tener al menos 10 caracteres, 1 símbolo, 1 número y 1 mayúscula";
        }
        if (!usuario.getEmail().matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            return "El email no es válido";
        }
        return "";
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuariosRegistrados);
    }


    @Override
    public boolean eliminarUsuario(int id) {
        return usuariosRegistrados.removeIf(u -> u.getId() == id);
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        for (int i = 0; i < usuariosRegistrados.size(); i++) {
            if (usuariosRegistrados.get(i).getId() == usuario.getId()) { // Usar ID para encontrar el usuario
                Usuario usuarioExistente = usuariosRegistrados.get(i);
                usuarioExistente.setNombre(usuario.getNombre());
                usuarioExistente.setApellido(usuario.getApellido());
                usuarioExistente.setUsername(usuario.getUsername());
                usuarioExistente.setPassword(usuario.getPassword());
                usuarioExistente.setEmail(usuario.getEmail());
                return true;
            }
        }
        return false;
    }


}
