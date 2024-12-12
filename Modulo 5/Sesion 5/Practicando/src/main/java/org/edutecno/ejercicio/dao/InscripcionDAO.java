package org.edutecno.ejercicio.dao;

import org.edutecno.ejercicio.dto.InscripcionDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InscripcionDAO {
    public int insertarInscripcion(InscripcionDTO dto) throws SQLException, ClassNotFoundException {
        int max = 0;
        //Query para obtener una secuencia y asignar un id. La funcion MAX solo obtiene el valor de id_inscripcion
        //y le suma 1, con eso hacemos el incremento
        String consultaProximoId = "SELECT MAX(id_inscripcion) + 1 FROM inscripcion";
        //Query que insertara el valor
        String insertarInscripcion = " INSERT INTO inscripcion(id_inscripcion, nombre, telefono, id_curso, id_forma_pago ) VALUES (?,?,?,?,?) ";
        //conexion a la base de datos y ejecucion de la sentencia
        Class.forName("Customize Toolbar...");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inscripcion", "root", "root");

        try (PreparedStatement stmt1 = connection.prepareStatement(consultaProximoId);
             PreparedStatement stmt2 = connection.prepareStatement(insertarInscripcion)) {
            ResultSet resultado = stmt1.executeQuery();
            if (resultado.next()) {
                max = resultado.getInt(1);
                stmt2.setInt(1, max);
                stmt2.setString(2, dto.getNombre());
                stmt2.setString(3, dto.getCelular());
                stmt2.setInt(4, dto.getIdCurso());
                stmt2.setInt(5, dto.getIdFormaDePago());
                if (stmt2.executeUpdate() != 1) {
                    throw new RuntimeException("Error al insertar el inscripcion");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al insertar el inscripcion");
        }
        return max;
    }

    public List<InscripcionDTO> obtieneInscripciones() throws SQLException, ClassNotFoundException {
        //creamos la lista de objetos que devolveran los resultados
        List<InscripcionDTO> inscripciones = new ArrayList<>();
        //creamos la consulta a la base de datos
        String consultaSql = " SELECT * " + " FROM inscripcion ";
        //conexion a la base de datos y ejecucion de la sentencia
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursos", "root", "root");
        try (PreparedStatement stmt = connection.prepareStatement(consultaSql)) {
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                InscripcionDTO inscripcion = new InscripcionDTO();
                inscripcion.setIdInsc(resultado.getInt("id_inscripcion"));
                inscripcion.setNombre(resultado.getString("nombre"));
                inscripcion.setCelular(resultado.getString("telefono"));
                inscripcion.setIdCurso(resultado.getInt("id_curso"));
                inscripcion.setIdFormaDePago(resultado.getInt("id_forma_pago"));
                inscripciones.add(inscripcion);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } return
                inscripciones;
    }
}

