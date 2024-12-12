package org.edutecno.prueba.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.dao.InscripcionDao;
import org.edutecno.prueba.entity.Inscripcion;

import java.io.IOException;

@WebServlet("/posInscripcion")
public class PosInscripcion extends HttpServlet {
    private final InscripcionDao inscripcionDao = new InscripcionDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        int idCurso = Integer.parseInt(request.getParameter("idCurso"));
        int idFormaPago = Integer.parseInt(request.getParameter("idFormaPago"));

        // Crear una nueva inscripción y guardarla en la base de datos
        Inscripcion inscripcion = new Inscripcion(nombre, telefono, idCurso, idFormaPago);
        int idInscripcion = inscripcionDao.guardarInscripcion(inscripcion);

        // Agregar atributos al request
        request.setAttribute("nombre", nombre);
        request.setAttribute("telefono", telefono);
        request.setAttribute("idCurso", idCurso);
        request.setAttribute("idFormaPago", idFormaPago);
        request.setAttribute("idInscripcion", idInscripcion);

        // Redirigir a confirmacion.jsp
        request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
    }
}