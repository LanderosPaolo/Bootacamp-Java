package org.edutecno.prueba.dao.daoimpl;

import org.edutecno.prueba.conexion.ConexionDB;
import org.edutecno.prueba.dao.EmpleadoDao;
import org.edutecno.prueba.model.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoImpl implements EmpleadoDao {

    @Override
    public List<Empleado> obtieneEmpleado() {
        List<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM empleados";

        try(Connection connection = ConexionDB.getConnection()){
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setNombreEmpleado(rs.getString("nombre_empleado"));
                empleado.setNumeroDepartamento(rs.getInt("numero_departamento"));
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return empleados;
    }
}
