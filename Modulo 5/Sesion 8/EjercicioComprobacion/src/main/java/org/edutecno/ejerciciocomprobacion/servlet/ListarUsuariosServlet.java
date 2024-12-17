package org.edutecno.ejerciciocomprobacion.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.ejerciciocomprobacion.dao.ListarDao;
import org.edutecno.ejerciciocomprobacion.dao.daoImpl.ListarDaoImpl;
import org.edutecno.ejerciciocomprobacion.dto.Usuario;

import java.io.IOException;
import java.util.List;

@WebServlet("/listaUsuarios")
public class ListarUsuariosServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ListarDao listarDao = new ListarDaoImpl();
        List<Usuario> listaUsuarios = listarDao.listarUsuario();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        listaUsuarios.forEach(usuario -> {
            try{
                response.getWriter().println("ID: " + usuario.getIdUsuario() +
                        ", nombre: " + usuario.getNombre() +
                        ", Clave: " + usuario.getClave() +
                        ", RUT: " + usuario.getRut() +
                        "-" + usuario.getDv()
                );
            }catch(Exception e){
                e.printStackTrace();
            }
        });
    }
}
