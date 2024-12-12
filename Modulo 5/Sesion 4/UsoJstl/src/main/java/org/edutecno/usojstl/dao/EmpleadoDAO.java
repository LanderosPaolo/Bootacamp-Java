package org.edutecno.usojstl.dao;

import org.edutecno.usojstl.models.DatabaseConnection;
import org.edutecno.usojstl.models.Empleado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "select * from empleado";

        try(Connection connection = DatabaseConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Empleado empleado = new Empleado(
                        resultSet.getInt("NUMEMPLEADO"),
                        resultSet.getString("NOMBRE")
                );
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
