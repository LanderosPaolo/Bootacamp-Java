package org.edutecno.prueba.controller;

import org.edutecno.prueba.models.Libro;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro cambiarDisponibilidad(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                libro.setDisponible(!libro.isDisponible());
                return libro;
            }
        }
        return null;
    }

    public List<Libro> buscarLibro(String frase) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().contains(frase) || libro.getAutor().getNombre().contains(frase)
                    || libro.getAutor().getApellido().contains(frase) || libro.getEditorial().getNombre().contains(frase)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }
}