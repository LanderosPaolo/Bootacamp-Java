package org.edutecno.prueba.interfaz;

import org.edutecno.prueba.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    List<Producto> findByMarca(String nombre);

    @Query("SELECT p FROM Producto p WHERE p.modelo = ?1")
    List<Producto> filtrarPorModelo(String modelo);

    @Query(value = "SELECT * FROM productos WHERE descripcion LIKE %?1%", nativeQuery = true)
    List<Producto> filtrarPorDescripcion(String descripcion);
}
