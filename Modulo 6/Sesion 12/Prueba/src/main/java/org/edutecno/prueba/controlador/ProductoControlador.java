package org.edutecno.prueba.controlador;

import org.edutecno.prueba.entidad.Producto;
import org.edutecno.prueba.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoControlador {
    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoServicio.listarProductos());
        return "productos/lista";
    }

    @PostMapping("/admin/agregar")
    public String agregarProducto(Producto producto) {
        productoServicio.guardarProducto(producto);
        return "redirect:/productos";
    }

    @PostMapping("/admin/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoServicio.eliminarProducto(id);
        return "redirect:/productos";
    }

    @PostMapping("/admin/editar/{id}")
    public String editarProducto(@PathVariable Long id, Producto producto) {
        Producto existente = productoServicio.obtenerProductoPorId(id);
        if (existente != null) {
            existente.setNombre(producto.getNombre());
            existente.setDescripcion(producto.getDescripcion());
            existente.setPrecio(producto.getPrecio());
            productoServicio.guardarProducto(existente);
        }
        return "redirect:/productos";
    }
}
