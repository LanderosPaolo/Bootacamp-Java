package org.edutecno.prueba.controlador;

import jakarta.validation.Valid;
import org.edutecno.prueba.entidad.Cheque;
import org.edutecno.prueba.servicio.ChequeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChequeControlador {
    @Autowired
    private ChequeServicio chequeServicio;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("cheque", new Cheque());
        return "home";
    }

    @PostMapping("/add")
    public String add(@Valid Cheque cheque, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "home";
        }
        chequeServicio.save(cheque);
        model.addAttribute("mensaje", "Cheque guardado correctamente");
        model.addAttribute("destinatario", cheque.getDestinatario());
        model.addAttribute("fecha", cheque.getFecha());
        model.addAttribute("monto", cheque.getMonto());
        return "home";
    }
}
