package org.edutecno.prueba.servicio;

import org.edutecno.prueba.entidad.Cheque;

import java.util.List;

public interface ChequeServicio {
    Cheque save(Cheque cheque);
    List<Cheque> findAll();
}
