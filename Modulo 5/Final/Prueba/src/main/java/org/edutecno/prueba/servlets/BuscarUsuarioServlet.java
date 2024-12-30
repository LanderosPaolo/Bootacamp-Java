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
import java.util.List;

@WebServlet("/buscarUsuario")
public class BuscarUsuarioServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsuarioDao usuarioDao = new UsuarioDaoImpl();
        List<Usuario> usuarios = usuarioDao.buscarUsuario();

        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("/listarUsuarios.jsp").forward(request, response);
    }
}
