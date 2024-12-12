package org.edutecno.ejercicio;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.edutecno.ejercicio.models.Producto;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/crearSession")
public class CrearSession extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Producto miProducto = new Producto(1, "iPhone", 1000);

        HttpSession session = request.getSession();
        session.setAttribute("miProducto", miProducto);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>"
                + "<body>" +
                "<p>Producto en session</p>" +
                "<a href='verSession'>Ir a verSession</a>" +
                "</body>" + "</html>");
    }
}
