package org.edutecno.pruebafinal.controlador;

import org.edutecno.pruebafinal.modelo.Alumno;
import org.edutecno.pruebafinal.servicio.AlumnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoControlador {
    @Autowired
    private AlumnoServicio alumnoServicio;

    @GetMapping
    public List<Alumno> findAll() {
        return alumnoServicio.findAll();
    }

    @PostMapping
    public Alumno save(@RequestBody Alumno alumno) {
        return alumnoServicio.save(alumno);
    }
}
