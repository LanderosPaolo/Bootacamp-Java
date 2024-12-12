package org.edutecno.prueba;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Proceso", value = "/factura")
public class Proceso extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCompleto = request.getParameter("nombreCompleto");
        String direccion = request.getParameter("direccion");
        int cantidadPlaca = Integer.parseInt(request.getParameter("cantidadPlaca"));
        int cantidadRam = Integer.parseInt(request.getParameter("cantidadRam"));
        int cantidadProce = Integer.parseInt(request.getParameter("cantidadProce"));
        int cantidadVideo = Integer.parseInt(request.getParameter("cantidadVideo"));

        int precioPlaca = 249000;
        int totalPrecioPlaca = cantidadPlaca * precioPlaca;
        int precioRam = 45990;
        int totalPrecioRam = cantidadRam * precioRam;
        int precioProce = 379000;
        int totalPrecioProce = cantidadProce * precioProce;
        int precioVideo = 219990;
        int totalPrecioVideo = cantidadVideo * precioVideo;
        int total = totalPrecioPlaca + totalPrecioRam + totalPrecioProce + totalPrecioVideo;

        double totalConDescuento = total * 0.90;

        request.setAttribute("nombreCompleto", nombreCompleto);
        request.setAttribute("direccion", direccion);
        request.setAttribute("cantidadPlaca", cantidadPlaca);
        request.setAttribute("cantidadRam", cantidadRam);
        request.setAttribute("cantidadProce", cantidadProce);
        request.setAttribute("cantidadVideo", cantidadVideo);
        request.setAttribute("totalPrecioPlaca", totalPrecioPlaca);
        request.setAttribute("totalPrecioRam", totalPrecioRam);
        request.setAttribute("totalPrecioProce", totalPrecioProce);
        request.setAttribute("totalPrecioVideo", totalPrecioVideo);
        request.setAttribute("total", total);
        request.setAttribute("totalConDescuento", totalConDescuento);

        request.getRequestDispatcher("factura.jsp").forward(request, response);
    }
}
