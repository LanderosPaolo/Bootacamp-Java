package org.edutecno.usojstl.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.usojstl.dao.EmpleadoDAO;
import org.edutecno.usojstl.models.Empleado;

import java.io.IOException;
import java.util.List;

@WebServlet("/empleados")
public class EmpleadoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmpleadoDAO dao = new EmpleadoDAO();
        List<Empleado> empleados = dao.obtenerEmpleados();
        request.setAttribute("empleados", empleados);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
