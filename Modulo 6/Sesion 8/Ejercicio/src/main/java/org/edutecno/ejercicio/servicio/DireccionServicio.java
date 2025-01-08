package org.edutecno.ejercicio.servicio;

import org.edutecno.ejercicio.entidad.Direccion;

import java.util.List;

public interface DireccionServicio {
    Direccion save(Direccion direccion);
    List<Direccion> findAll();
}
