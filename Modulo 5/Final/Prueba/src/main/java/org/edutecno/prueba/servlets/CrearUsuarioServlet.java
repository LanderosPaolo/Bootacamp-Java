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

@WebServlet("/registroUsuario")
public class CrearUsuarioServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String username = request.getParameter("username");
        String correo = request.getParameter("correo");
        String fechaNacimiento = request.getParameter("nacimiento");
        String pass = request.getParameter("pass");
        String pass2 = request.getParameter("pass2");

        if(pass == null || pass2 == null || !pass.equals(pass2)) {
            request.setAttribute("error", "Las contraseñas no coinciden o están vacías.");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
            return;
        }

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setUsername(username);
        usuario.setEmail(correo);
        usuario.setFechaNacimiento(java.sql.Date.valueOf(fechaNacimiento));
        usuario.setPassword(pass);

        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        usuario = usuarioDao.obtenerAnimal(usuario);
        boolean exito = usuarioDao.registrarUsuario(usuario);

        if(exito) {
            response.sendRedirect("login.jsp");
        } else {
            request.getRequestDispatcher("registro.jsp").forward(request, response);
        }
    }
}
