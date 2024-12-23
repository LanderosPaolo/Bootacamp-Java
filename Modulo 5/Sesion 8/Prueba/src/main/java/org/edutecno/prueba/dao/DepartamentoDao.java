package org.edutecno.prueba.dao;

import org.edutecno.prueba.dto.DepartamentoDto;

import java.util.List;

public interface DepartamentoDao {
    List<DepartamentoDto> listaDepartamentos();
    List<DepartamentoDto> filtroDepartamentosPorNombre(String nombreDepartamento);
    List<DepartamentoDto> filtroDepartamentosPorUbicacion(String ubicacionDepartamento);
}
