package org.edutecno.pruebafinal.controlador;

import org.edutecno.pruebafinal.entidad.Libro;
import org.edutecno.pruebafinal.servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroControlador {
    @Autowired
    private LibroServicio libroServicio;

    @GetMapping
    public ResponseEntity<List<Libro>> listar() {
        List<Libro> libros = libroServicio.listarTodos();
        return ResponseEntity.ok(libros);
    }

    @PostMapping
    public ResponseEntity<Libro> guardarLibro(@RequestBody Libro libro) {
        Libro libroGuardado = libroServicio.guardar(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(libroGuardado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> actualizar(@PathVariable Long id, @RequestBody Libro libro) {
        Optional<Libro> libroExistente = libroServicio.buscarPorId(id);
        if (libroExistente.isPresent()) {
            Libro actualizado = libroExistente.get();
            actualizado.setTitulo(libro.getTitulo());
            actualizado.setAutor(libro.getAutor());
            actualizado.setAnioLanzamiento(libro.getAnioLanzamiento());
            actualizado.setDisponible(libro.isDisponible());
            return ResponseEntity.ok(libroServicio.guardar(actualizado));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        libroServicio.eliminar(id);
    }
}
