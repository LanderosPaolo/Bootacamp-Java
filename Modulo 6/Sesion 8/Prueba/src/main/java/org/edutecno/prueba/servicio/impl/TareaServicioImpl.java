package org.edutecno.prueba.servicio.impl;

import org.edutecno.prueba.modelo.Tarea;
import org.edutecno.prueba.repositorio.TareaRepositorio;
import org.edutecno.prueba.servicio.TareaServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServicioImpl implements TareaServicio {
    private final TareaRepositorio tareaRepositorio;

    public TareaServicioImpl(TareaRepositorio tareaRepositorio) {
        this.tareaRepositorio = tareaRepositorio;
    }

    @Override
    public Tarea save(Tarea tarea) {
        return tareaRepositorio.save(tarea);
    }

    @Override
    public void delete(Tarea tarea) {
        tareaRepositorio.delete(tarea);
    }

    @Override
    public List<Tarea> findAll() {
        return tareaRepositorio.findAll();
    }
}
