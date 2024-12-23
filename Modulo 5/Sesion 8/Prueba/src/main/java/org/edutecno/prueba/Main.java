package org.edutecno.prueba;

import org.edutecno.prueba.dao.DepartamentoDao;
import org.edutecno.prueba.dao.daoImpl.DepartamentoDaoImpl;

public class Main {
    public static void main(String[] args) {
        DepartamentoDao departamentoDAO = new DepartamentoDaoImpl();
        System.out.println(departamentoDAO.filtroDepartamentosPorNombre("RRHH"));
    }
}
