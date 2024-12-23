package org.edutecno.prueba.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.edutecno.prueba.service.UsuarioService;

import java.io.IOException;

@WebServlet("/inicio_sesion")
public class InicioSesionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsuarioService service = new UsuarioService();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(service.validarUsuario(username, password)){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
