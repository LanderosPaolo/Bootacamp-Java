package org.edutecno.prueba.mapper;

import org.apache.ibatis.annotations.*;
import org.edutecno.prueba.modelo.Cliente;

import java.util.List;

@Mapper
public interface ClienteMapper {
    //obtener
    @Select("SELECT * FROM cliente")
    @Results({
            @Result(property = "idCliente", column = "id_cliente"),
            @Result(property = "primerNombre", column = "primer_nombre"),
            @Result(property = "segundoNombre", column = "segundo_nombre"),
            @Result(property = "apellPaterno", column = "apell_paterno"),
            @Result(property = "apellMaterno", column = "apell_materno"),
            @Result(property = "direccion", column = "direccion"),
    })
    List<Cliente> obtenerClientes();

    // Insertar
    @Insert("INSERT INTO cliente (primer_nombre, segundo_nombre, apell_paterno, apell_materno, direccion) " +
            "VALUES (#{primerNombre}, #{segundoNombre}, #{apellPaterno}, #{apellMaterno}, #{direccion})")
    @Options(useGeneratedKeys = true, keyProperty = "idCliente", keyColumn = "id_cliente")
    void agregarCliente(Cliente cliente);

    // Obtener por ID
    @Select("SELECT * FROM cliente WHERE id_cliente = #{idCliente}")
    @Results({
            @Result(property = "idCliente", column = "id_cliente"),
            @Result(property = "primerNombre", column = "primer_nombre"),
            @Result(property = "segundoNombre", column = "segundo_nombre"),
            @Result(property = "apellPaterno", column = "apell_paterno"),
            @Result(property = "apellMaterno", column = "apell_materno"),
            @Result(property = "direccion", column = "direccion")
    })
    Cliente obtenerClientePorId(int idCliente);
}
