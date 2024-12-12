package org.edutecno.prueba.controller;

import org.edutecno.prueba.dao.CursoDAO;
import org.edutecno.prueba.dao.FormaDePagoDAO;
import org.edutecno.prueba.dao.InscripcionDAO;
import org.edutecno.prueba.dto.CursoDTO;
import org.edutecno.prueba.dto.FormaDePagoDTO;
import org.edutecno.prueba.dto.InscripcionDTO;

import java.sql.SQLException;
import java.util.List;

public class Facade {
    private final InscripcionDAO inscripcionDAO = new InscripcionDAO();
    private final CursoDAO cursoDAO = new CursoDAO();
    private final FormaDePagoDAO formaDePagoDAO = new FormaDePagoDAO();

    public List<InscripcionDTO> obtieneInscripciones() throws SQLException, ClassNotFoundException {
        return inscripcionDAO.obtieneInscripciones();
    }

    public List<CursoDTO> obtieneCursos() throws SQLException, ClassNotFoundException {
        return cursoDAO.obtieneCurso();
    }

    public List<FormaDePagoDTO> obtieneFormaDePagos() throws SQLException, ClassNotFoundException {
        return formaDePagoDAO.obtieneFormaDePago();
    }
}
