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

@WebServlet("/modificarUsuario")
public class ModificarUsuarioServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String username = request.getParameter("username");
        String correo = request.getParameter("correo");
        String fechaNacimiento = request.getParameter("nacimiento");
        String password = request.getParameter("pass");

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre(nombre);
        usuario.setUsername(username);
        usuario.setEmail(correo);
        usuario.setFechaNacimiento(java.sql.Date.valueOf(fechaNacimiento));
        usuario.setPassword(password);

        UsuarioDao usuarioDAO = new UsuarioDaoImpl();
        boolean exito = usuarioDAO.modificarUsuario(usuario);

        if (exito) {
            request.getRequestDispatcher("listarUsuarios.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("modificarUsuario.jsp").forward(request, response);
        }
    }
}