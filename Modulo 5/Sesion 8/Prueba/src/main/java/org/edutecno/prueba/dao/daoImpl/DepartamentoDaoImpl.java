package org.edutecno.prueba.dao.daoImpl;

import org.edutecno.prueba.connection.AdministradorConexion;
import org.edutecno.prueba.dao.DepartamentoDao;
import org.edutecno.prueba.dto.DepartamentoDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDaoImpl implements DepartamentoDao {
    @Override
    public List<DepartamentoDto> listaDepartamentos() {
        List<DepartamentoDto> listaDepartamentoDTO = new ArrayList<>();
        String sql = "SELECT * FROM departamento";

        try(Connection connection = AdministradorConexion.getConexion();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                DepartamentoDto departamentoDTO = new DepartamentoDto();
                departamentoDTO.setNumDepartamento(resultSet.getInt("num_depto"));
                departamentoDTO.setNombreDepartamento(resultSet.getString("nombre_departamento"));
                departamentoDTO.setUbicacionDepartamento(resultSet.getString("ubicacion_departamento"));
                listaDepartamentoDTO.add(departamentoDTO);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return listaDepartamentoDTO;
    }

    @Override
    public List<DepartamentoDto> filtroDepartamentosPorNombre(String nombreDepartamento) {
        List<DepartamentoDto> departamentoPorNombre = new ArrayList<>();
        String sql = "SELECT * FROM departamento WHERE nombre_departamento = ?";
        try(Connection connection = AdministradorConexion.getConexion();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1,nombreDepartamento);

            try(ResultSet resultSet = statement.executeQuery()){

                while (resultSet.next()) {
                    DepartamentoDto departamento = new DepartamentoDto();
                    departamento.setNumDepartamento(resultSet.getInt("num_depto"));
                    departamento.setNombreDepartamento(resultSet.getString("nombre_departamento"));
                    departamento.setUbicacionDepartamento(resultSet.getString("ubicacion_departamento"));
                    departamentoPorNombre.add(departamento);
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return departamentoPorNombre;

    }

    @Override
    public List<DepartamentoDto> filtroDepartamentosPorUbicacion(String ubicacionDepartamento) {
        List<DepartamentoDto> departamentoPorUbicacion = new ArrayList<>();
        String sql = "SELECT * FROM departamento WHERE ubicacion_departamento = ?";

        try(Connection connection = AdministradorConexion.getConexion();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1,ubicacionDepartamento);

            try(ResultSet resultSet = statement.executeQuery()){

                while (resultSet.next()) {
                    DepartamentoDto departamento = new DepartamentoDto();
                    departamento.setNumDepartamento(resultSet.getInt("num_depto"));
                    departamento.setNombreDepartamento(resultSet.getString("nombre_departamento"));
                    departamento.setUbicacionDepartamento(resultSet.getString("ubicacion_departamento"));
                    departamentoPorUbicacion.add(departamento);
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return departamentoPorUbicacion;
    }
}