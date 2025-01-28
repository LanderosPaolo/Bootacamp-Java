package org.edutecno.prueba.controlador;

import org.edutecno.prueba.modelo.Post;
import org.edutecno.prueba.servicio.ApiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PostControlador {
    @Autowired
    private ApiServicio servicio;

    @GetMapping("/posts")
    public String listarPosts(Model model) {
        List<Post> posts = servicio.obtenerPosts();
        model.addAttribute("posts", posts);
        return "posts";
    }
}
