package org.edutecno.prueba.servicio;

import org.edutecno.prueba.modelo.Tarea;

import java.util.List;

public interface TareaServicio {
    Tarea save(Tarea tarea);
    void delete(Tarea tarea);
    List<Tarea> findAll();
}
