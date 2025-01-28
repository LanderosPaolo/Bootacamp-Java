package org.edutecno.prueba.controlador;

import org.edutecno.prueba.entidades.Estudiante;
import org.edutecno.prueba.entidades.Inscripcion;
import org.edutecno.prueba.entidades.Materia;
import org.edutecno.prueba.servicio.EstudianteServicio;
import org.edutecno.prueba.servicio.InscripcionServicio;
import org.edutecno.prueba.servicio.MateriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inscripciones")
public class InscripcionControlador {
    @Autowired
    private InscripcionServicio inscripcionServicio;
    @Autowired
    private EstudianteServicio estudianteServicio;
    @Autowired
    private MateriaServicio materiaServicio;

    @GetMapping("/agregar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("inscripcion", new Inscripcion());
        model.addAttribute("estudiantes", estudianteServicio.listarEstudiantes());
        model.addAttribute("materias", materiaServicio.listarMaterias());
        return "inscribirMateria";
    }

    @PostMapping("/guardarInscripcion")
    public String guardarInscripcion(@RequestParam Long estudianteId, @RequestParam Long materiaId) {
        Estudiante estudiante = estudianteServicio.findById(estudianteId);
        Materia materia = materiaServicio.findById(materiaId);
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setEstudiante(estudiante);
        inscripcion.setMateria(materia);
        inscripcionServicio.inscribir(estudiante, materia);
        return "redirect:/inscripciones/lista";
    }

    @GetMapping("/lista")
    public String listarInscripciones(Model model) {
        model.addAttribute("inscripciones", inscripcionServicio.listarInscripciones());
        return "listaInscripciones";
    }
}
