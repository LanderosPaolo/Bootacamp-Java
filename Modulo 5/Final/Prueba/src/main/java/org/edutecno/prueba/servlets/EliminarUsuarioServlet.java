package org.edutecno.prueba.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.dao.UsuarioDao;
import org.edutecno.prueba.dao.daoImpl.UsuarioDaoImpl;
import org.edutecno.prueba.dto.Usuario;

import java.io.IOException;

@WebServlet("/eliminarUsuario")
public class EliminarUsuarioServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

        if (usuario != null) {
            request.setAttribute("usuario", usuario);
            request.getRequestDispatcher("eliminarUsuario.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtenemos el usuario desde la sesión
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

        if (usuario != null) {
            // Eliminar el usuario de la base de datos
            UsuarioDao usuarioDao = new UsuarioDaoImpl();
            boolean eliminado = usuarioDao.eliminarUsuario(usuario.getId());

            if (eliminado) {
                // Invalida la sesión
                request.getSession().invalidate(); // Aquí se invalida la sesión correctamente

                // Redirige a la página de login
                response.sendRedirect("login.jsp");
            } else {
                // Si no se pudo eliminar, redirige a la lista de usuarios
                response.sendRedirect("listarUsuarios.jsp");
            }
        } else {
            // Si no hay usuario en sesión, redirigimos al login
            response.sendRedirect("login.jsp");
        }
    }
}
