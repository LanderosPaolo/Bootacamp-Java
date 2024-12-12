package org.edutecno.prueba.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.controller.Facade;
import org.edutecno.prueba.dto.CursoDTO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/ListaCursos")
public class PreListarCursos extends HttpServlet {
    private final Facade facade = new Facade();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<CursoDTO> curso = facade.obtieneCursos();
            request.setAttribute("curso", curso);
            request.getRequestDispatcher("/ListarCursos.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("error", "Hubo un error al obtener las inscripciones.");
        }
    }
}