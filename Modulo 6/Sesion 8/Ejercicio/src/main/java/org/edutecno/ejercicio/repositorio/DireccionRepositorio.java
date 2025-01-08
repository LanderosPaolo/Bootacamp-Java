package org.edutecno.ejercicio.repositorio;

import org.edutecno.ejercicio.entidad.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepositorio extends JpaRepository<Direccion, Long> {
}
