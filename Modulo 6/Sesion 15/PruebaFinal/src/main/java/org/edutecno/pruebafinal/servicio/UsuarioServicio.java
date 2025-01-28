package org.edutecno.pruebafinal.servicio;

import org.edutecno.pruebafinal.entidad.Usuario;
import org.edutecno.pruebafinal.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public Usuario saveUsuario(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepositorio.save(usuario);
    }

    public List<Usuario> findAllUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public Optional<Usuario> findUsuarioById(Long id) {
        return usuarioRepositorio.findById(id);
    }

    public void deleteUsuario(Long id) {
        usuarioRepositorio.deleteById(id);
    }
}
