package org.edutecno.prueba.servicio;

import org.edutecno.prueba.modelo.Pelicula;
import org.edutecno.prueba.repositorio.PeliculaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServicio {
    private final PeliculaRepositorio peliculaRepositorio;

    public PeliculaServicio(PeliculaRepositorio peliculaRepositorio) {
        this.peliculaRepositorio = peliculaRepositorio;
    }

    // Crear
    public String crearPelicula(Pelicula pelicula) {
        if (peliculaRepositorio.idYaRegistrado(pelicula.getId())) {
            return "Error: Id ya registrada";
        }
        peliculaRepositorio.crearPelicula(
                pelicula.getId(),
                pelicula.getTitulo(),
                pelicula.getDirector(),
                pelicula.getAnio(),
                pelicula.getDuracion()
        );
        return "Película creada exitosamente";
    }

    //Obtener
    public List<Pelicula> obtenerPeliculas() {
        return peliculaRepositorio.obtenerPeliculas();
    }

    //Obtener por ID
    public String obtenerPeliculaPorId(int id) {
        if (!peliculaRepositorio.idYaRegistrado(id)) {
            return "Error: No se ha encontrado la Película";
        }
        Pelicula pelicula = peliculaRepositorio.obtenerPeliculaPorId(id);
        return pelicula.toString();
    }

    // Actualizar
    public String actualizarPelicula(Pelicula pelicula) {
        if (!peliculaRepositorio.idYaRegistrado(pelicula.getId())) {
            return "Error: Id no registrada";
        }
        peliculaRepositorio.actualizarPelicula(
                pelicula.getId(),
                pelicula.getTitulo(),
                pelicula.getDirector(),
                pelicula.getAnio(),
                pelicula.getDuracion()
        );
        return "Película actualizada exitosamente";
    }

    // Eliminar
    public String eliminarPelicula(int id) {
        if (!peliculaRepositorio.idYaRegistrado(id)) {
            return "Error: Id no registrada";
        }
        peliculaRepositorio.eliminarPelicula(id);
        return "Película eliminada exitosamente";
    }
}
