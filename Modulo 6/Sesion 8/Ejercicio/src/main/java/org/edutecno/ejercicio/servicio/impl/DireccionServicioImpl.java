package org.edutecno.ejercicio.servicio.impl;

import org.edutecno.ejercicio.entidad.Direccion;
import org.edutecno.ejercicio.repositorio.DireccionRepositorio;
import org.edutecno.ejercicio.repositorio.PersonaRepositorio;
import org.edutecno.ejercicio.servicio.DireccionServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionServicioImpl implements DireccionServicio {
    private final DireccionRepositorio direccionRepositorio;

    public DireccionServicioImpl(DireccionRepositorio direccionRepositorio) {
        this.direccionRepositorio = direccionRepositorio;
    }

    @Override
    public Direccion save(Direccion direccion) {
        return direccionRepositorio.save(direccion);
    }

    @Override
    public List<Direccion> findAll() {
        return direccionRepositorio.findAll();
    }
}
