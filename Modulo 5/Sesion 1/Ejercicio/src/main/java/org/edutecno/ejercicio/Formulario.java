package org.edutecno.ejercicio;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Formulario", value = "/formulario")
public class Formulario extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Ejercicio - formulario</h1>");
        out.println("<form action='respuesta' method='get'>");
        out.println("<label for='nombre'>Ingrese un nombre:</label>");
        out.println("<br>");
        out.println("<input type='text' name='nombre' id='nombre' placeholder='Nombre' required>");
        out.println("<button type='submit'>Enviar</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}