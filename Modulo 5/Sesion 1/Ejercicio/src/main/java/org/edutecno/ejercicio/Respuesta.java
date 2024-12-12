package org.edutecno.ejercicio;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Respuesta", value = "/respuesta")
public class Respuesta extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String nombre = request.getParameter("nombre");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>El nombre enviado es: " + "'" + nombre + "'" + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}