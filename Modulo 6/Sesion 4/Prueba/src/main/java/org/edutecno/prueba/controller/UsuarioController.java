package org.edutecno.prueba.controller;

import org.edutecno.prueba.model.Usuario;
import org.edutecno.prueba.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model, @RequestParam(required = false) Integer id) {
        Usuario usuario = id == null ? new Usuario() : usuarioService.listarUsuarios().stream().filter(u -> u.getId() == id).findFirst().orElse(new Usuario());
        model.addAttribute("usuario", usuario);
        model.addAttribute("accion", id == null ? "agregar" : "actualizar");
        return "formulario";
    }

    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarUsuarios());
        return "usuarios";
    }

    @PostMapping("/agregar")
    public String agregarUsuario(@ModelAttribute Usuario usuario, Model model) {
        String mensaje = usuarioService.validarUsuario(usuario);
        if (mensaje.isEmpty()) {
            usuarioService.registrarUsuario(usuario);
            model.addAttribute("mensaje", "Usuario registrado correctamente");
            return "redirect:/usuarios";
        } else {
            model.addAttribute("mensaje", "El registro ha fallado: " + mensaje);
        }
        model.addAttribute("usuario", usuario);
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable int id, Model model) {
        if (usuarioService.eliminarUsuario(id)) {
            model.addAttribute("mensaje", "Usuario eliminado correctamente");
        } else {
            model.addAttribute("mensaje", "Error al eliminar el usuario");
        }
        return "redirect:/usuarios";
    }

    @GetMapping("/opciones")
    public String mostrarOpciones() {
        return "opciones";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable int id, Model model) {
        Usuario usuario = usuarioService.listarUsuarios().stream()
                .filter(u -> u.getId() == id)
                .findFirst().orElse(new Usuario());

        model.addAttribute("usuario", usuario);
        model.addAttribute("accion", "actualizar");
        return "formulario";
    }


    @PostMapping("/actualizar")
    public String actualizarUsuario(@ModelAttribute Usuario usuario, Model model) {
        String mensaje = usuarioService.validarUsuario(usuario);
        if (mensaje.isEmpty()) {
            if (usuarioService.actualizarUsuario(usuario)) {
                model.addAttribute("mensaje", "Usuario actualizado correctamente");
            } else {
                model.addAttribute("mensaje", "Error al actualizar el usuario");
            }
            return "redirect:/usuarios";
        } else {
            model.addAttribute("mensaje", "La actualización ha fallado: " + mensaje);
        }
        model.addAttribute("usuario", usuario);
        return "formulario";
    }
}
