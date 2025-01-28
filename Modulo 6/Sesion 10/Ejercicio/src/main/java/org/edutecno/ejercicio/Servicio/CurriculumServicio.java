package org.edutecno.ejercicio.Servicio;

import org.edutecno.ejercicio.entidad.Curriculum;

import java.util.List;

public interface CurriculumServicio {
    Curriculum save(Curriculum c);
    List<Curriculum> findAll();
}
