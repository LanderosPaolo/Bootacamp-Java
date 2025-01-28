package org.edutecno.pruebafinal.servicio;

import org.edutecno.pruebafinal.modelo.Materia;
import org.edutecno.pruebafinal.repositorio.MateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaServicio {
    @Autowired
    private MateriaRepositorio materiaRepositorio;

    public Materia save(Materia materia) {
        return materiaRepositorio.save(materia);
    }
}
