package org.edutecno.pruebafinal.repositorio;

import org.edutecno.pruebafinal.entidad.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
