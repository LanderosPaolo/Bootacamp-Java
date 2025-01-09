package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio extends JpaRepository<Tarea, Long> {
}
