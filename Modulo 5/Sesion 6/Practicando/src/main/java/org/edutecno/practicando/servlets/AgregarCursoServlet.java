package org.edutecno.practicando.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.practicando.dao.CursoDao;
import org.edutecno.practicando.entidades.Curso;

import java.io.IOException;

@WebServlet("agregarCurso")
public class AgregarCursoServlet extends HttpServlet {
    private final CursoDao cursoDao = new CursoDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descripcion = request.getParameter("descripcionCurso");
        double precio = Double.parseDouble(request.getParameter("precioCurso"));

        Curso curso = new Curso();
        curso.setDescripcion(descripcion);
        curso.setPrecio(precio);

        cursoDao.agregarCurso(curso);

        response.sendRedirect("listarCursos");
    }
}