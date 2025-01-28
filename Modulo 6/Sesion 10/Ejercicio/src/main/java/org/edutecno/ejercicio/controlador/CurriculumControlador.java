package org.edutecno.ejercicio.controlador;

import jakarta.validation.Valid;
import org.edutecno.ejercicio.Servicio.CurriculumServicio;
import org.edutecno.ejercicio.entidad.Curriculum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CurriculumControlador {
    @Autowired
    private CurriculumServicio curriculumServicio;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("curriculum", new Curriculum());
        return "home";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Curriculum curriculum, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "home";
        }
        curriculumServicio.save(curriculum);
        model.addAttribute("mensaje", "Currículum guardado exitosamente");
        model.addAttribute("email", curriculum.getEmail());
        model.addAttribute("numero", curriculum.getNumero());
        return "home";
    }
}
