package org.edutecno.ejercicio.controller;

import org.edutecno.ejercicio.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @GetMapping("/form")
    public String mostrar(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "form";
    }

    @PostMapping("/user")
    public String procesar(@ModelAttribute Usuario usuario, Model model) {
        model.addAttribute("usuario", usuario);
        return "respuesta";
    }
}


