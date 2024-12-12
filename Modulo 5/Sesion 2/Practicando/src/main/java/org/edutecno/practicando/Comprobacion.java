package org.edutecno.practicando;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "formulario", value = "/respuesta")
public class Comprobacion extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String password = request.getParameter("password");

        int contadorMayus = 0;
        int contadorMinus = 0;
        int contadorNum = 0;

        for(char letra : password.toCharArray()){
            if(Character.isUpperCase(letra)) {
                contadorMayus ++;
            } else if(Character.isLowerCase(letra)) {
                contadorMinus ++;
            } else if(Character.isDigit(letra)) {
                contadorNum ++;
            }
        }

        String respuesta;
        String contrasena;
        if(contadorMayus >= 4 && contadorMinus >= 3 && contadorNum >= 3) {
            contrasena = password;
            respuesta = "Esta contraseña es fuerte";
        } else {
            contrasena = password;
            respuesta = "Esta contraseña es débil";
        }

        request.setAttribute("respuesta", respuesta);
        request.setAttribute("contrasena", contrasena);

        request.getRequestDispatcher("./views/Respuesta.jsp").forward(request, response);
    }
}
