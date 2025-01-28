package org.edutecno.prueba.servicio;

import org.edutecno.prueba.entidades.Estudiante;
import org.edutecno.prueba.entidades.Inscripcion;
import org.edutecno.prueba.entidades.Materia;
import org.edutecno.prueba.repositorio.InscripcionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class InscripcionServicio {
    @Autowired
    private InscripcionRepositorio inscripcionRepositorio;

    public Inscripcion inscribir(Estudiante estudiante, Materia materia) {
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setEstudiante(estudiante);
        inscripcion.setMateria(materia);
        return inscripcionRepositorio.save(inscripcion);
    }

    public List<Inscripcion> listarInscripciones() {
        return inscripcionRepositorio.findAll();
    }

    @PostMapping("/guardar")
    public String guardarInscripcion(@ModelAttribute("inscripcion") Inscripcion inscripcion) {
        return "redirect:/inscripciones";
    }
}
