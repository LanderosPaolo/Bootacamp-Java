package org.edutecno.ejercicio.controlador;

import org.edutecno.ejercicio.entidad.Direccion;
import org.edutecno.ejercicio.entidad.Persona;
import org.edutecno.ejercicio.servicio.DireccionServicio;
import org.edutecno.ejercicio.servicio.PersonaServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private final PersonaServicio personaServicio;
    private final DireccionServicio direccionServicio;

    public HomeController(PersonaServicio personaServicio, DireccionServicio direccionServicio) {
        this.personaServicio = personaServicio;
        this.direccionServicio = direccionServicio;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("personas", personaServicio.findAll());
        model.addAttribute("direcciones", direccionServicio.findAll());
        return "home";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("persona", new Persona());
        model.addAttribute("direccion", new Direccion());
        return "form";
    }

    @PostMapping("/enviar")
    public String enviar(@ModelAttribute Persona persona, @ModelAttribute Direccion direccion) {
        direccion.setPersona(persona);
        persona.setDireccion(direccion);
        personaServicio.save(persona);
        return "redirect:/";
    }
}