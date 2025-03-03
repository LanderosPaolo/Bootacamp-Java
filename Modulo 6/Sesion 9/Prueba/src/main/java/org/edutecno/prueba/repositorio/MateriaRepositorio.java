package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.entidades.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepositorio extends JpaRepository<Materia, Long> {
}
