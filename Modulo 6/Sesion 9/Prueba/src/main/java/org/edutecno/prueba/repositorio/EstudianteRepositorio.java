package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}
