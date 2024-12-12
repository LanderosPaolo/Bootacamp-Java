package org.edutecno.ejercicio.dao;

import org.edutecno.ejercicio.dto.FormaDePagoDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FormaDePagoDAO {
    public List<FormaDePagoDTO> obtieneFormaDePago() throws SQLException, ClassNotFoundException {
        //creamos la lista de objetos que devolveran los resultados
        List<FormaDePagoDTO> formaDePago = new ArrayList<>();
        //creamos la consulta a la base de datos
        String consultaSql = "SELECT id_forma_pago, descripcion, recarga FROM forma_pago";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursos", "root", "root");

        try (PreparedStatement stmt = connection.prepareStatement(consultaSql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                FormaDePagoDTO formaPago = new FormaDePagoDTO();
                formaPago.setIdFormaDePago(rs.getInt("id_forma_pago"));
                formaPago.setDescripcion(rs.getString("descripcion"));
                formaPago.setRecargo(rs.getDouble(("recarga")));
                formaDePago.add(formaPago);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return formaDePago;
    }
}
