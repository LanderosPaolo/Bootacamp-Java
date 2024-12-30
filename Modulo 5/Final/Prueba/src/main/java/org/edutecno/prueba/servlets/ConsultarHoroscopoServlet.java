package org.edutecno.prueba.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.dto.Usuario;

import java.io.IOException;

@WebServlet("/consultarHoroscopo")
public class ConsultarHoroscopoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

        if (usuario == null) {
            System.out.println("Usuario no encontrado en la sesión.");
        } else {
            System.out.println("Usuario encontrado: " + usuario.getUsername());
        }

        if (usuario != null && usuario.getFechaNacimiento() != null) {
            String animal = usuario.obtenerAnimal();
            usuario.setAnimal(animal);
            request.setAttribute("animal", animal);
        } else {
            System.out.println("Fecha de nacimiento no disponible o usuario nulo.");
            request.setAttribute("error", "Usuario no encontrado o fecha de nacimiento no disponible.");
        }

        request.getRequestDispatcher("consultarHoroscopo.jsp").forward(request, response);
    }
}
