package org.edutecno.prueba.controlador;

import org.edutecno.prueba.modelo.Tarea;
import org.edutecno.prueba.servicio.TareaServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TareaControlador {
    private final TareaServicio tareaServicio;

    public TareaControlador(TareaServicio tareaServicio) {
        this.tareaServicio = tareaServicio;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Tarea> tareas = tareaServicio.findAll();
        model.addAttribute("tareasCompletadas", tareas.stream().filter(Tarea::isCompletado).toList());
        model.addAttribute("tareasIncompletas", tareas.stream().filter(t -> !t.isCompletado()).toList());
        return "home";
    }

    @PostMapping("/add")
    public String add(@RequestParam String mensaje) {
        Tarea nuevaTarea = new Tarea();
        nuevaTarea.setMensaje(mensaje);
        nuevaTarea.setCompletado(false);
        tareaServicio.save(nuevaTarea);
        return "redirect:/";
    }

    @PostMapping("/done")
    public String done(@RequestParam Long id) {
        Tarea tarea = tareaServicio.findAll().stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (tarea != null) {
            tarea.setCompletado(true);
            tareaServicio.save(tarea);
        }
        return "redirect:/";
    }
}
