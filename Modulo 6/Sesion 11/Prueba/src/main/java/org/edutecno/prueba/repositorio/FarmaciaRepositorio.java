package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.entidad.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaRepositorio extends JpaRepository<Farmacia, Long> {
}
