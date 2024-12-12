package org.edutecno.ejercicio.controller;

import org.edutecno.ejercicio.dao.CursoDAO;
import org.edutecno.ejercicio.dao.FormaDePagoDAO;
import org.edutecno.ejercicio.dao.InscripcionDAO;
import org.edutecno.ejercicio.dto.CursoDTO;
import org.edutecno.ejercicio.dto.FormaDePagoDTO;
import org.edutecno.ejercicio.dto.InscripcionDTO;

import java.sql.SQLException;
import java.util.List;

public class Facade {
    public int registrarInscripcion(InscripcionDTO dto) throws SQLException, ClassNotFoundException {
        InscripcionDAO dao = new InscripcionDAO();
        return dao.insertarInscripcion(dto);
    }
    //metodo nuevo desafio
    public List<InscripcionDTO> obtieneInscripciones() throws SQLException, ClassNotFoundException {
        InscripcionDAO dao = new InscripcionDAO();
        return dao.obtieneInscripciones();
    }

    public List<CursoDTO> obtieneCursos() throws SQLException, ClassNotFoundException {
        CursoDAO dao = new CursoDAO();
        return dao.obtieneCurso();
    }

    public List<FormaDePagoDTO> obtieneFormaDePagos() throws SQLException, ClassNotFoundException {
        FormaDePagoDAO dao = new FormaDePagoDAO();
        return dao.obtieneFormaDePago();
    }
}
