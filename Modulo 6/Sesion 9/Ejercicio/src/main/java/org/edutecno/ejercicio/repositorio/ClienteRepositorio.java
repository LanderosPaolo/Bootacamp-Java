package org.edutecno.ejercicio.repositorio;

import org.edutecno.ejercicio.entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
