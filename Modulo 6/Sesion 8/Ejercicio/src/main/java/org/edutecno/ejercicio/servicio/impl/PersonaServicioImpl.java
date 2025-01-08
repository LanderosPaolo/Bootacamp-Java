package org.edutecno.ejercicio.servicio.impl;

import org.edutecno.ejercicio.entidad.Persona;
import org.edutecno.ejercicio.repositorio.PersonaRepositorio;
import org.edutecno.ejercicio.servicio.PersonaServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicioImpl implements PersonaServicio {
    private final PersonaRepositorio personaRepositorio;

    public PersonaServicioImpl(PersonaRepositorio personaRepositorio) {
        this.personaRepositorio = personaRepositorio;
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepositorio.save(persona);
    }

    @Override
    public List<Persona> findAll() {
        return personaRepositorio.findAll();
    }
}
