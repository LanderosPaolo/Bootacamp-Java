package org.edutecno.practicando.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.practicando.dao.CursoDao;
import org.edutecno.practicando.entidades.Curso;

import java.io.IOException;
import java.util.List;

@WebServlet("listarCursos")
public class ListarCursosServlet extends HttpServlet {
    private final CursoDao cursoDao = new CursoDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Curso> cursos = cursoDao.listarCursos();
            request.setAttribute("cursos", cursos);
            request.getRequestDispatcher("listarCursos.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
