package org.edutecno.ejercicio.controller;

import org.edutecno.ejercicio.model.Usuario;
import org.edutecno.ejercicio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "formulario";
    }

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute Usuario usuario, Model model) {
        String mensaje = usuarioService.validarUsuario(usuario);
        if (mensaje.isEmpty()) {
            usuarioService.registrarUsuario(usuario);
            model.addAttribute("mensaje", "Usuario registrado correctamente");
        } else {
            model.addAttribute("mensaje", "El registro ha fallado: " + mensaje);
        }
        model.addAttribute("usuario", usuario);
        return "formulario";
    }
}
