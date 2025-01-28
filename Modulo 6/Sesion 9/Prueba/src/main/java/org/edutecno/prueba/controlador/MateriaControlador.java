package org.edutecno.prueba.controlador;

import org.edutecno.prueba.entidades.Materia;
import org.edutecno.prueba.repositorio.MateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/materias")
public class MateriaControlador {
    @Autowired
    private MateriaRepositorio materiaRepositorio;

    @GetMapping("/agregar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("materia", new Materia());
        return "agregarMateria";
    }

    @PostMapping("/guardar")
    public String guardarMateria(@ModelAttribute Materia materia) {
        materiaRepositorio.save(materia);
        return "redirect:/materias/lista";
    }

    @GetMapping("/lista")
    public String listarMaterias(Model model) {
        model.addAttribute("materias", materiaRepositorio.findAll());
        return "listaMaterias";
    }
}
