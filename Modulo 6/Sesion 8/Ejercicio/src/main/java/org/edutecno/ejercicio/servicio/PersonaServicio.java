package org.edutecno.ejercicio.servicio;

import org.edutecno.ejercicio.entidad.Persona;

import java.util.List;

public interface PersonaServicio {
    Persona save(Persona persona);
    List<Persona> findAll();
}
