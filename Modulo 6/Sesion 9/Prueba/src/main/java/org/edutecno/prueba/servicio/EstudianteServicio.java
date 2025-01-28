package org.edutecno.prueba.servicio;

import org.edutecno.prueba.entidades.Estudiante;
import org.edutecno.prueba.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicio {
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    public Estudiante findById(Long id) {
        return estudianteRepositorio.findById(id).orElse(null);
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    public List<Estudiante> listarEstudiantes() {
        return estudianteRepositorio.findAll();
    }
}
