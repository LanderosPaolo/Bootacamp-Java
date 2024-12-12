package org.edutecno.practicando.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.practicando.dao.CursoDao;

import java.io.IOException;

@WebServlet("eliminarCurso")
public class EliminarCursoServlet extends HttpServlet {
    private final CursoDao cursoDao = new CursoDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCurso = Integer.parseInt(request.getParameter("id"));
        cursoDao.eliminarCurso(idCurso);

        response.sendRedirect("listarCursos");

    }
}
