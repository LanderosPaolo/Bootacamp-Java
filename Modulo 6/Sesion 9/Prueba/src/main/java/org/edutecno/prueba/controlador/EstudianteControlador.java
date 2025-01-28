package org.edutecno.prueba.controlador;

import org.edutecno.prueba.entidades.Estudiante;
import org.edutecno.prueba.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/estudiantes")
public class EstudianteControlador {
    @Autowired
    private EstudianteServicio estudianteServicio;

    @GetMapping("/agregar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "agregarEstudiante";
    }

    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes/lista";
    }

    @GetMapping("/lista")
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteServicio.listarEstudiantes());
        return "listaEstudiantes";
    }
}
