package org.edutecno.prueba.controlador;

import org.edutecno.prueba.modelo.Cliente;
import org.edutecno.prueba.servicio.ClienteServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {
    private final ClienteServicio clienteServicio;

    public ClienteControlador(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @PostMapping
    public String agregarCliente(@RequestBody Cliente cliente) {
        clienteServicio.agregarCliente(cliente);
        return "Cliente agregado con exito";
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteServicio.obtenerClientes();
    }

    @GetMapping("/{id}")
    public Cliente obtenerClientePorId(@PathVariable int id) {
        return clienteServicio.obtenerClientePorId(id);
    }
}
