package org.edutecno.ejercicio.Servicio.impl;

import org.edutecno.ejercicio.Servicio.CurriculumServicio;
import org.edutecno.ejercicio.entidad.Curriculum;
import org.edutecno.ejercicio.repositorio.CurriculumRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumServicioImpl implements CurriculumServicio {
    @Autowired
    private CurriculumRepositorio curriculumRepositorio;

    @Override
    public Curriculum save(Curriculum curriculum) {
        return curriculumRepositorio.save(curriculum);
    }

    @Override
    public List<Curriculum> findAll() {
        return curriculumRepositorio.findAll();
    }
}
