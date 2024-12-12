package org.edutecno.prueba;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Valores", value = "/valores")
public class Valores extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCompleto = request.getParameter("nombreCompleto");
        String direccion = request.getParameter("direccion");
        int cantidadPlaca = Integer.parseInt(request.getParameter("cantidadPlaca"));
        int cantidadRam = Integer.parseInt(request.getParameter("cantidadRam"));
        int cantidadProce = Integer.parseInt(request.getParameter("cantidadProce"));
        int cantidadVideo = Integer.parseInt(request.getParameter("cantidadVideo"));

        request.setAttribute("nombreCompleto", nombreCompleto);
        request.setAttribute("direccion", direccion);
        request.setAttribute("cantidadPlaca", cantidadPlaca);
        request.setAttribute("cantidadRam", cantidadRam);
        request.setAttribute("cantidadProcesador", cantidadProce);
        request.setAttribute("cantidadVideo", cantidadVideo);

        request.getRequestDispatcher("/factura").forward(request, response);
    }
}
