package org.edutecno.prueba.ayuda;

import org.edutecno.prueba.entity.Producto;
import org.edutecno.prueba.servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductoAyuda implements CommandLineRunner {

    @Autowired
    private ProductoService productoService;

    public static void main(String[] args) {
        SpringApplication.run(ProductoAyuda.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Listar
        System.out.println("Listado de productos:");
        productoService.listarTodos().forEach(System.out::println);

        // Filtra
        System.out.println("\nFiltrar por marca 'Adventurer':");
        productoService.buscarPorMarca("Adventurer").forEach(System.out::println);

        // Filtrar
        System.out.println("\nFiltrar por modelo 'Linterna LED':");
        productoService.buscarPorModelo("Linterna LED").forEach(System.out::println);

        // Filtrar
        System.out.println("\nFiltrar por palabra clave 'montaña':");
        productoService.buscarPorDescripcion("montaña").forEach(System.out::println);

        // Insertar
        Producto nuevoProducto = new Producto();
        nuevoProducto.setModelo("Nuevo Modelo");
        nuevoProducto.setMarca("Nueva Marca");
        nuevoProducto.setDescripcion("Descripción del nuevo producto");
        productoService.insertarProducto(nuevoProducto);

        // Eliminar
        productoService.eliminarProducto(1);

        // Actualizar
        Producto productoExistente = productoService.listarTodos().get(0);
        productoExistente.setDescripcion("Descripción actualizada");
        productoService.actualizarProducto(productoExistente);
    }
}
