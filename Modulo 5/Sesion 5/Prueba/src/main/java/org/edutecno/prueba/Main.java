package org.edutecno.prueba;

import org.edutecno.prueba.controller.Facade;
import org.edutecno.prueba.dto.CursoDTO;
import org.edutecno.prueba.dto.FormaDePagoDTO;
import org.edutecno.prueba.dto.InscripcionDTO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CursoDTO curso = new CursoDTO();

        curso.setIdCurso(1);
        curso.setDescripcion("Descripcion");
        curso.setPrecio(20000);

        System.out.println(curso.toString());

        Facade facade = new Facade();
        try {
            List<CursoDTO> listaCursos = null;
            try {
                listaCursos = facade.obtieneCursos();
                System.out.println(listaCursos);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            List<FormaDePagoDTO> listaFormasPago = null;
            try {
                listaFormasPago = facade.obtieneFormaDePagos();
                System.out.println(listaFormasPago);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            List<InscripcionDTO> listaInscripcion = null;
            try{
                listaInscripcion = facade.obtieneInscripciones();
                System.out.println(listaInscripcion);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}