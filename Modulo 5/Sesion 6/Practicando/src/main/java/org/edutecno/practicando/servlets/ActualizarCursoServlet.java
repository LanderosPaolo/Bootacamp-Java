package org.edutecno.practicando.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.practicando.dao.CursoDao;
import org.edutecno.practicando.entidades.Curso;

import java.io.IOException;

@WebServlet("actualizarCurso")
public class ActualizarCursoServlet extends HttpServlet {
    private final CursoDao CursoDao = new CursoDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCurso = Integer.parseInt(request.getParameter("id"));
        Curso curso = CursoDao.buscarCursoPorId(idCurso);
        request.setAttribute("curso", curso);

        request.getRequestDispatcher("actualizarCurso.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCurso = Integer.parseInt(request.getParameter("id"));
        String descripcion = request.getParameter("descripcionCurso");
        double precio = Double.parseDouble(request.getParameter("precioCurso"));

        Curso curso = new Curso();
        curso.setIdCurso(idCurso);
        curso.setDescripcion(descripcion);
        curso.setPrecio(precio);
        CursoDao.actualizarCurso(curso);

        response.sendRedirect("listarCursos");
    }

}
