package org.edutecno.ejercicio;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.edutecno.ejercicio.models.Producto;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/verSession")
public class VerSession extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);

        Producto miProducto = (Producto) session.getAttribute("miProducto");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (miProducto != null) {
            out.println("<html>");
            out.println("<body>");
            out.println("<p>ID: " + miProducto.getId() + "</p><br>");
            out.println("<p>Concepto: " + miProducto.getConcepto() + "</p><br>");
            out.println("<p>Importe: " + miProducto.getImporte() + "</p><br>");
            out.println("<p>Datos del objeto producto generado manualmente en el servlet CrearSession</p>");
            out.println("</body>");
            out.println("</html>");
        } else {
            out.println("<html>");
            out.println("<body>");
            out.println("<p>No hay producto en la sesión.</p>");
            out.print("</body>");
            out.println("</html>");
        }
    }
}
