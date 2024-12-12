package org.edutecno.practicando;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Formulario", urlPatterns = {"/formulario-servlet"})
public class Formulario extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");

        PrintWriter outInfo = response.getWriter();

        outInfo.println("<html>");
        outInfo.println("<body>");
        outInfo.println("<h1>Datos recibidos desde la pagina de formulario</h1>");
        outInfo.println("<p>" + nombre + "</p>");
        outInfo.println("<p>" + edad + "</p>");
        outInfo.println("</body>");
        outInfo.println("</html>");

    }
}
