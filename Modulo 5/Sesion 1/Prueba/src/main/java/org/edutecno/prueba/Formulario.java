package org.edutecno.prueba;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Formulario", value = "/formulario")
public class Formulario extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<title>Suma & Multiplicacion</title>");
        out.println("<body>");
        out.println("<h1>Suma & Multiplicacion</h1>");
        out.println("<form action='' method='post'>");
        out.println("<label for='valor1'>Ingrese el valor 1: </label>");
        out.println("<input type='number' id='valor1' name='valor1' step='any'>");
        out.println("<br>");
        out.println("<label for='valor2'>Ingrese el valor 2: </label>");
        out.println("<input type='number' name='valor2' id='valor2' step='any'>");
        out.println("<br>");
        out.println("<br>");
        out.println("<button type='submit'>Calcular</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        double valor1 = Double.parseDouble(request.getParameter("valor1"));
        double valor2 = Double.parseDouble(request.getParameter("valor2"));

        out.println("<html>");
        out.println("<title>Suma & Multiplicacion</title>");
        out.println("<body>");
        out.println("<h1>Suma & Multiplicacion</h1>");
        out.println("<p>La suma de valores es: " + (valor1 + valor2) + "</p>");
        out.println("<p>La multiplicacion es: " + (valor1 * valor2) + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
