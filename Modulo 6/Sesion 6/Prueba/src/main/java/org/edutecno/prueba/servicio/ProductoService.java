package org.edutecno.prueba.servicio;

import org.edutecno.prueba.entity.Producto;
import org.edutecno.prueba.interfaz.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    public Producto insertarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    public void eliminarProducto(Integer id) {
        productoRepositorio.deleteById(id);
    }

    public Producto actualizarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    public List<Producto> listarTodos() {
        return productoRepositorio.findAll();
    }

    public List<Producto> buscarPorMarca(String marca) {
        return productoRepositorio.findByMarca(marca);
    }

    public List<Producto> buscarPorModelo(String modelo) {
        return productoRepositorio.filtrarPorModelo(modelo);
    }

    public List<Producto> buscarPorDescripcion(String palabraClave) {
        return productoRepositorio.filtrarPorDescripcion(palabraClave);
    }
}
