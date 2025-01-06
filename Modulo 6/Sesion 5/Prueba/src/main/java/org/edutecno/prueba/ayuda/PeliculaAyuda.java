package org.edutecno.prueba.ayuda;

import org.edutecno.prueba.modelo.Pelicula;
import org.edutecno.prueba.servicio.PeliculaServicio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PeliculaAyuda  implements CommandLineRunner {
    private final PeliculaServicio peliculaServicio;

    public PeliculaAyuda(PeliculaServicio peliculaServicio) {
        this.peliculaServicio = peliculaServicio;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n=========================");
        System.out.println("Intentando crear dos películas con el mismo ID");
        System.out.println("=========================");
        Pelicula pelicula1 = new Pelicula(1, "Inception", "Christopher Nolan", 2010, 148);
        Pelicula pelicula2 = new Pelicula(1, "Interstellar", "Christopher Nolan", 2014, 169);
        System.out.println("Resultado: " + peliculaServicio.crearPelicula(pelicula1));
        System.out.println("Resultado: " + peliculaServicio.crearPelicula(pelicula2));

        System.out.println("\n=========================");
        System.out.println("Intentando eliminar la misma película dos veces");
        System.out.println("=========================");
        System.out.println("Resultado: " + peliculaServicio.eliminarPelicula(1));
        System.out.println("Resultado: " + peliculaServicio.eliminarPelicula(1));

        System.out.println("\n=========================");
        System.out.println("Intentando actualizar una película inexistente");
        System.out.println("=========================");
        Pelicula pelicula3 = new Pelicula(2, "The Matrix", "The Wachowskis", 1999, 136);
        System.out.println("Resultado: " + peliculaServicio.actualizarPelicula(pelicula3));

        System.out.println("\n=========================");
        System.out.println("Intentando recuperar una película con un ID no registrado");
        System.out.println("=========================");
        System.out.println("Resultado: " + peliculaServicio.obtenerPeliculaPorId(3));
    }
}
