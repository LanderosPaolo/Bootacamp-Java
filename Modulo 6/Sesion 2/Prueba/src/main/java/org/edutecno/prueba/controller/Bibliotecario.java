package org.edutecno.prueba.controller;

import org.edutecno.prueba.models.Libro;
import org.edutecno.prueba.service.IAyudante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bibliotecario {

    private IAyudante ayudante;

    @Autowired
    public Bibliotecario(IAyudante ayudante) {
        this.ayudante = ayudante;
    }

    public void solicitanTodosLosLibros() {
        System.out.println("Lista de todos los libros:");
        for (Libro libro : ayudante.obtenerLibros()) {
            System.out.println(libro.getTitulo());
        }
    }

    public void agregarUnLibro(Libro libro) {
        ayudante.agregarLibro(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void devolucionOPrestamoDeLibro(int id) {
        Libro libro = ayudante.cambiarDisponibilidad(id);
        if (libro != null) {
            System.out.println("Cambio de disponibilidad para el libro: " + libro.getTitulo());
        } else {
            System.out.println("No se encontró el libro con ID: " + id);
        }
    }

    public void buscarLibro(String frase) {
        System.out.println("Resultados de la búsqueda de '" + frase + "':");
        for (Libro libro : ayudante.buscarLibro(frase)) {
            System.out.println(libro.getTitulo());
        }
    }
}