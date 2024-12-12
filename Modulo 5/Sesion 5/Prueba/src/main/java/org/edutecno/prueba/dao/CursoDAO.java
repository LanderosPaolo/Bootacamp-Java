package org.edutecno.prueba.dao;

import org.edutecno.prueba.dto.CursoDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    public List<CursoDTO> obtieneCurso() throws SQLException, ClassNotFoundException {

        List<CursoDTO> listaDeCursos = new ArrayList<>();

        String consultaSql = " SELECT * FROM cursos";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursos", "root", "root");

        try (PreparedStatement stmt = connection.prepareStatement(consultaSql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CursoDTO cursoDTO = new CursoDTO();
                cursoDTO.setIdCurso(rs.getInt("id_curso"));
                cursoDTO.setDescripcion(rs.getString("descripcion"));
                cursoDTO.setPrecio(rs.getDouble("precio"));
                listaDeCursos.add(cursoDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaDeCursos;
    }
}