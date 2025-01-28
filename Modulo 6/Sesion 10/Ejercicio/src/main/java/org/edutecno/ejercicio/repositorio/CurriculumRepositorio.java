package org.edutecno.ejercicio.repositorio;

import org.edutecno.ejercicio.entidad.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepositorio extends JpaRepository<Curriculum, Long> {
}
