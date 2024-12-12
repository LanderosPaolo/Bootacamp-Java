package org.edutecno.prueba.dao;

import org.edutecno.prueba.models.DatabaseConnection;
import org.edutecno.prueba.models.Departamento;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAO {
    public List<Departamento> obtenerDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();
        String query = "SELECT * FROM departamento";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Departamento departamento = new Departamento(
                        resultSet.getInt("NUMDEPTO"),
                        resultSet.getString("NOMDEPTO"),
                        resultSet.getString("UBICACIONDPTO")
                );
                departamentos.add(departamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departamentos;
    }
}
