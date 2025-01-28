package org.edutecno.prueba.servicio;

import org.edutecno.prueba.entidades.Materia;
import org.edutecno.prueba.repositorio.MateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServicio {
    @Autowired
    private MateriaRepositorio materiaRepositorio;

    public Materia findById(Long id) {
        return materiaRepositorio.findById(id).orElse(null);
    }

    public Materia guardarMateria(Materia materia) {
        return materiaRepositorio.save(materia);
    }

    public List<Materia> listarMaterias() {
        return materiaRepositorio.findAll();
    }
}
