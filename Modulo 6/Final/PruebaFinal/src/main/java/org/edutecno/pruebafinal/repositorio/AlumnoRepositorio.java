package org.edutecno.pruebafinal.repositorio;

import org.edutecno.pruebafinal.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {
}
