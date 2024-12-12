package org.edutecno.ejercicio;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.ejercicio.dto.UserDTO;
import org.edutecno.ejercicio.enumClass.RoleEnum;

import java.io.IOException;

@WebServlet("/datos")
public class DatosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String roleParam = request.getParameter("rol");
        RoleEnum role = RoleEnum.fromString(roleParam);

        UserDTO user = new UserDTO();
        user.setName(name);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);

        request.setAttribute("name", name);
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("password", password);
        request.setAttribute("role", role);

        request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
    }
}
