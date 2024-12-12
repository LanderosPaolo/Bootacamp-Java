package org.edutecno.prueba.dao;

import org.edutecno.prueba.dto.InscripcionDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InscripcionDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cursos";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public List<InscripcionDTO> obtieneInscripciones() throws SQLException, ClassNotFoundException {
        List<InscripcionDTO> inscripciones = new ArrayList<>();

        String consultaSql = "SELECT * FROM inscripcion";
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Conectando a la base de datos..." );
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(consultaSql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("Consulta ejecutada con éxito." + consultaSql);

            while (rs.next()) {
                InscripcionDTO inscripcion = new InscripcionDTO();
                inscripcion.setIdInsc(rs.getInt("ID_INSCRIPCION"));
                inscripcion.setNombre(rs.getString("NOMBRE"));
                inscripcion.setCelular(rs.getString("TELEFONO"));
                inscripcion.setIdCurso(rs.getInt("ID_CURSO"));
                inscripcion.setIdFormaDePago(rs.getInt("ID_FORMA_PAGO"));
                inscripciones.add(inscripcion);
            }

        }
        return inscripciones;
    }
}
