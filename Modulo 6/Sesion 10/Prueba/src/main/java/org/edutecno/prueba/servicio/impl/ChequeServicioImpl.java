package org.edutecno.prueba.servicio.impl;

import org.edutecno.prueba.entidad.Cheque;
import org.edutecno.prueba.repositorio.ChequeRepositorio;
import org.edutecno.prueba.servicio.ChequeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChequeServicioImpl implements ChequeServicio {
    @Autowired
    private ChequeRepositorio chequeRepositorio;

    @Override
    public Cheque save(Cheque cheque) {
        return chequeRepositorio.save(cheque);
    }

    @Override
    public List<Cheque> findAll() {
        return chequeRepositorio.findAll();
    }
}
