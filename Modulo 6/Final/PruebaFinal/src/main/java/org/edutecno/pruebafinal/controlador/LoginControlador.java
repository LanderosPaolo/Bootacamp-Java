package org.edutecno.pruebafinal.controlador;

import org.edutecno.pruebafinal.modelo.Alumno;
import org.edutecno.pruebafinal.modelo.User;
import org.edutecno.pruebafinal.servicio.AlumnoServicio;
import org.edutecno.pruebafinal.servicio.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginControlador {
    @Autowired
    private UserService userService;

    @Autowired
    private AlumnoServicio alumnoServicio;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model) {
        String token = userService.signin(user.getUsername(), user.getPassword());
        if (token != null) {
            model.addAttribute("token", token);
            return "redirect:/home";
        }
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        List<Alumno> alumnos = alumnoServicio.findAll();
        model.addAttribute("alumnos", alumnos);
        return "home";
    }
}
