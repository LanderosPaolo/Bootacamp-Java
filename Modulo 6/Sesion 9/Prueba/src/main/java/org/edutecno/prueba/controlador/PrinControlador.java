package org.edutecno.prueba.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrinControlador {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
