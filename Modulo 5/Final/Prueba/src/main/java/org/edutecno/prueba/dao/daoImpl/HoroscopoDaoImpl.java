package org.edutecno.prueba.dao.daoImpl;

import org.edutecno.prueba.dao.HoroscopoDao;
import org.edutecno.prueba.dto.Horoscopo;
import org.edutecno.prueba.procesaconexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoroscopoDaoImpl implements HoroscopoDao {
    @Override
    public List<Horoscopo> obtenerHoroscopo() {
        List<Horoscopo> listaHoroscopo = new ArrayList<>();
        String sql = "SELECT * FROM Horoscopo";
        try(Connection conn = Conexion.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {

            while(rs.next()){
                listaHoroscopo.add(new Horoscopo(
                   rs.getString("ANIMAL"),
                        rs.getDate("FECHA_INICIO"),
                        rs.getDate("FECHA_FIN")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaHoroscopo;
    }
}
