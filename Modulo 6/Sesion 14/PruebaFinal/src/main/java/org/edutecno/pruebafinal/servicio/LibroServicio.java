package org.edutecno.pruebafinal.servicio;

import org.edutecno.pruebafinal.entidad.Libro;
import org.edutecno.pruebafinal.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;

    public List<Libro> listarTodos() {
        return libroRepositorio.findAll();
    }

    public Libro guardar(Libro libro) {
        return libroRepositorio.save(libro);
    }

    public Optional<Libro> buscarPorId(Long id) {
        return libroRepositorio.findById(id);
    }

    public void eliminar(Long id) {
        libroRepositorio.deleteById(id);
    }
}
