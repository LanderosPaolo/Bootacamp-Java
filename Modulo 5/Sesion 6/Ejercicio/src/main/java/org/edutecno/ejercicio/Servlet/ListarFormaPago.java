package org.edutecno.ejercicio.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.ejercicio.dao.FormaPagoDao;
import org.edutecno.ejercicio.entity.FormaPago;

import java.io.IOException;
import java.util.List;

@WebServlet("/listarFormaPago")
public class ListarFormaPago extends HttpServlet {
    private final FormaPagoDao formaPagoDao = new FormaPagoDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<FormaPago> formasPago = formaPagoDao.obtenerFormaPagos();
        request.setAttribute("formasPago", formasPago);
        request.getRequestDispatcher("listarFormaPago.jsp").forward(request, response);
    }
}
