package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.entidades.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepositorio extends JpaRepository<Inscripcion, Long> {
}
