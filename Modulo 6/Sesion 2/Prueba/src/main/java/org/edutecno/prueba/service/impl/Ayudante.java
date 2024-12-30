package org.edutecno.prueba.service.impl;

import org.edutecno.prueba.controller.Biblioteca;
import org.edutecno.prueba.models.Libro;
import org.edutecno.prueba.service.IAyudante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Ayudante implements IAyudante {

    private Biblioteca biblioteca;

    @Autowired
    public Ayudante(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public List<Libro> buscarLibro(String frase) {
        return biblioteca.buscarLibro(frase);
    }

    @Override
    public List<Libro> obtenerLibros() {
        return biblioteca.obtenerLibros();
    }

    @Override
    public void agregarLibro(Libro libro) {
        biblioteca.agregarLibro(libro);
    }

    @Override
    public Libro cambiarDisponibilidad(int id) {
        return biblioteca.cambiarDisponibilidad(id);
    }
}