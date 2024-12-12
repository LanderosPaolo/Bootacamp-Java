package org.edutecno.prueba.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.dao.DepartamentoDAO;
import org.edutecno.prueba.models.Departamento;

import java.io.IOException;
import java.util.List;

@WebServlet("/departamentos")
public class DepartamentoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DepartamentoDAO dao = new DepartamentoDAO();
        List<Departamento> departamentos = dao.obtenerDepartamentos();
        request.setAttribute("departamentos", departamentos);
        request.getRequestDispatcher("/areaPrivada.jsp").forward(request, response);
    }
}
