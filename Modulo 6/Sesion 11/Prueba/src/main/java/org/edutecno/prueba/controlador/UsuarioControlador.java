package org.edutecno.prueba.controlador;

import org.edutecno.prueba.entidad.Usuario;
import org.edutecno.prueba.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioControlador {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/usuarios/agregar")
    public String agregarUsuario(Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        usuarioRepositorio.save(usuario);
        return "redirect:/medicamentos/listar";
    }
}
