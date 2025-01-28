package org.edutecno.pruebafinal.controlador;

import org.edutecno.pruebafinal.modelo.Materia;
import org.edutecno.pruebafinal.servicio.MateriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materias")
public class MateriaControlador {
    @Autowired
    private MateriaServicio materiaServicio;

    @PostMapping
    public Materia save(@RequestBody Materia materia) {
        return materiaServicio.save(materia);
    }
}
