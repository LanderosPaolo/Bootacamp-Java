package org.edutecno.prueba.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.prueba.dao.EmpleadoDao;
import org.edutecno.prueba.dao.daoimpl.EmpleadoDaoImpl;
import org.edutecno.prueba.model.Empleado;

import java.io.IOException;
import java.util.List;

@WebServlet("/listarEmpleados")
public class ListarEmpleadosServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        EmpleadoDao empleadoDao = new EmpleadoDaoImpl();
        List<Empleado> empleados = empleadoDao.obtieneEmpleado();

        request.setAttribute("empleados", empleados);
        request.getRequestDispatcher("listaEmpleados.jsp").forward(request, response);
    }
}
