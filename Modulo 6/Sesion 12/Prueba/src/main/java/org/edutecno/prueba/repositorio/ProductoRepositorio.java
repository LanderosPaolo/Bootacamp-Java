package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
}
