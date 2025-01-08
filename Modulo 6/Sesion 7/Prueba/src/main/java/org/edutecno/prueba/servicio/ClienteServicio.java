package org.edutecno.prueba.servicio;

import org.edutecno.prueba.mapper.ClienteMapper;
import org.edutecno.prueba.modelo.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio {
    private final ClienteMapper clienteMapper;

    public ClienteServicio(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }

    public void agregarCliente(Cliente cliente) {
        clienteMapper.agregarCliente(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clienteMapper.obtenerClientes();
    }

    public Cliente obtenerClientePorId(int idCliente) {
        return clienteMapper.obtenerClientePorId(idCliente);
    }
}
