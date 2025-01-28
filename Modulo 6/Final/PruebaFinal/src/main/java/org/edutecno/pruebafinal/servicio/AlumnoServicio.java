package org.edutecno.pruebafinal.servicio;

import org.edutecno.pruebafinal.modelo.Alumno;
import org.edutecno.pruebafinal.repositorio.AlumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServicio {
    @Autowired
    private AlumnoRepositorio alumnoRepositorio;

    public Alumno save(Alumno alumno) {
        return alumnoRepositorio.save(alumno);
    }

    public List<Alumno> findAll() {
        return alumnoRepositorio.findAll();
    }
}
