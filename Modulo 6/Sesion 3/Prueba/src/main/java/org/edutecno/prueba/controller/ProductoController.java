package org.edutecno.prueba.controller;

import org.edutecno.prueba.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductoController {
    private List<Producto> productos = new ArrayList<>();
    private int contador = 1;

    @GetMapping("/producto/agregar")
    public String mostrarForm(Model model) {
        model.addAttribute("producto", new Producto());
        return "form";
    }

    @PostMapping("/producto/procesar")
    public String procesar(@ModelAttribute Producto producto) {
        producto.setId(contador++);
        productos.add(producto);
        return "redirect:/producto/mostrar";
    }

    @GetMapping("/producto/mostrar")
    public String mostrar(Model model) {
        model.addAttribute("productos", productos);
        return "lista";
    }
}
