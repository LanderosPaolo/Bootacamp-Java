package org.edutecno.ejercicio.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.ejercicio.controller.Facade;
import org.edutecno.ejercicio.dto.InscripcionDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/PreListarInscripciones")
public class PreListarInscripciones extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Facade facade = new Facade();

        try {
            List<InscripcionDTO> inscripciones = facade.obtieneInscripciones();
            request.setAttribute("inscripciones", inscripciones);
            request.getRequestDispatcher("ListaInscripciones.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*try {
            List<InscripcionDTO> listaInscripciones = facade.obtieneInscripciones();

            request.setAttribute("listaInscripciones", listaInscripciones);

            request.getRequestDispatcher("ListaInscripciones.jsp").forward(request, response);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("error", "Error al obtener inscripciones: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }*/
    }
}