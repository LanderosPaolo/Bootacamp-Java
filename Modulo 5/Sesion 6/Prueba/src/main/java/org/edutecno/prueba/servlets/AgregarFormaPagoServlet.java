package org.edutecno.prueba.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.dao.FormaPagoDao;
import org.edutecno.prueba.entity.FormaPago;

import java.io.IOException;

@WebServlet("/agregarFormaPago")
public class AgregarFormaPagoServlet extends HttpServlet {
    private final FormaPagoDao formaPagoDao = new FormaPagoDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descripcion = request.getParameter("descripcion");
        String recarga = request.getParameter("recarga");

        FormaPago fp = new FormaPago();
        fp.setDescripcion(descripcion);
        fp.setRecarga(recarga);

        formaPagoDao.agregarFormaPago(fp);

        response.sendRedirect("listarFormaPago");
    }
}