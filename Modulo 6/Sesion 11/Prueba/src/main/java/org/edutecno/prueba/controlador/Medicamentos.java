package org.edutecno.prueba.controlador;

import org.edutecno.prueba.entidad.Farmacia;
import org.edutecno.prueba.repositorio.FarmaciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Medicamentos {
    @Autowired
    private FarmaciaRepositorio farmaciaRepositorio;

    @GetMapping("/medicamentos/listar")
    public String listarMedicamentos(Model model) {
        model.addAttribute("medicamentos", farmaciaRepositorio.findAll());
        return "medicamentos/listar";
    }

    @PostMapping("/medicamentos/agregar")
    public String agregarMedicamento(Farmacia farmacia) {
        farmaciaRepositorio.save(farmacia);
        return "redirect:/medicamentos/listar";
    }
}
