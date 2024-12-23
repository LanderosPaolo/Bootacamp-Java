package org.edutecno.prueba.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.dao.DepartamentoDao;
import org.edutecno.prueba.dao.daoImpl.DepartamentoDaoImpl;
import org.edutecno.prueba.dto.DepartamentoDto;

import java.io.IOException;
import java.util.List;

@WebServlet("/departamentos")
public class DepartamentoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DepartamentoDao departamentoDao = new DepartamentoDaoImpl();
        List<DepartamentoDto> listaDepartamentos = null;

        String filtroNombre = request.getParameter("nombre");
        String filtroUbicacion = request.getParameter("ubicacion");

        if (filtroNombre != null) {
            listaDepartamentos= departamentoDao.filtroDepartamentosPorNombre(filtroNombre);
        } else if (filtroUbicacion != null) {
            listaDepartamentos = departamentoDao.filtroDepartamentosPorUbicacion(filtroUbicacion);
        } else{
            listaDepartamentos = departamentoDao.listaDepartamentos();
        }

        request.setAttribute("listaDepartamentos", listaDepartamentos);
        request.getRequestDispatcher("departamentos.jsp").forward(request, response);
    }
}