package org.edutecno.prueba.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.controller.Facade;
import org.edutecno.prueba.dto.InscripcionDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/ListaInscripciones")
public class PreListarInscripcionesServlet extends HttpServlet {
    private final Facade facade = new Facade();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<InscripcionDTO> PreListarInscripcionesServlet = facade.obtieneInscripciones();
            request.setAttribute("PreListarInscripcionesServlet", PreListarInscripcionesServlet);
            request.getRequestDispatcher("ListaInscripciones.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al obtener las inscripciones.");
        }
    }
}
