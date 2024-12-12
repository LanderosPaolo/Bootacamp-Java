package org.edutecno.prueba;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.edutecno.prueba.models.Usuario;

import java.io.IOException;

@WebServlet("/ProcesaLogin")
public class ProcesaLogin extends HttpServlet {
    //Agregamos un usuario para poder hacer la prueba
    Usuario usuario1 = new Usuario("usuario1", "Usuario1234");

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("pass");

        if (usuario1.getUsuario().equals(usuario) && password.equals(usuario1.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            response.sendRedirect("sesion.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
