package org.edutecno.ejercicio.dao;

import org.edutecno.ejercicio.dto.CursoDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    public List<CursoDTO> obtieneCurso() throws SQLException , ClassNotFoundException {
        //creamos la lista de objetos que devolveran los resultados
        List<CursoDTO> listaDeCursos = new ArrayList<CursoDTO>();
        //creamos la consulta a la base de datos
        String consultaSql = " SELECT id_curso, descripcion, precio FROM cursos ";

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
