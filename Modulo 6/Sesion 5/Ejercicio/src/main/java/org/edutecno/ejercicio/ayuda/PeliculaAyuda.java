package org.edutecno.ejercicio.ayuda;

import jakarta.annotation.PostConstruct;
import org.edutecno.ejercicio.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PeliculaAyuda {
    private final PeliculaRepositorio peliculaRepositorio;

    @Autowired
    public PeliculaAyuda(PeliculaRepositorio peliculaRepositorio) {
        this.peliculaRepositorio = peliculaRepositorio;
    }

    @PostConstruct
    public void init() {
        System.out.println("<------------------->");
        System.out.println("CREAR PELICULAS");
        peliculaRepositorio.crearPelicula(1,"Star Wars", "George Lucas", 1977, 121);
        peliculaRepositorio.crearPelicula(2,"Dune", "David Lynch", 1984, 137);
        peliculaRepositorio.crearPelicula(3,"The Matrix", "The Wachowskis", 1999, 136);
        System.out.println("<------------------->");

        System.out.println("<------------------->");
        System.out.println("LISTA DE PELICULAS");
        peliculaRepositorio.obtenerPeliculas().forEach(System.out::println);
        System.out.println("<------------------->");

        System.out.println("<------------------->");
        System.out.println("ACTUALIZAR PELICULA");
        peliculaRepositorio.actualizarPelicula(3, "The Martrix Reloaded", "The Wachowskis", 2003, 138);
        peliculaRepositorio.obtenerPeliculas().forEach(System.out::println);
        System.out.println("<------------------->");

        System.out.println("<------------------->");
        System.out.println("ELIMINAR PELICULA");
        peliculaRepositorio.eliminarPelicula(2);
        peliculaRepositorio.obtenerPeliculas().forEach(System.out::println);
        System.out.println("<------------------->");
    }
}
