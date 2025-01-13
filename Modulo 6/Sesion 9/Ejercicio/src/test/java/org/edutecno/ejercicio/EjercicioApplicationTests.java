package org.edutecno.ejercicio;

import org.edutecno.ejercicio.entidad.Cliente;
import org.edutecno.ejercicio.entidad.MiniBodega;
import org.edutecno.ejercicio.repositorio.ClienteRepositorio;
import org.edutecno.ejercicio.repositorio.MiniBodegaRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EjercicioApplicationTests {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private MiniBodegaRepositorio miniBodegaRepositorio;

    @Test
    public void textCrear() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        cliente.setRut("12.345.678-9");
        cliente.setDireccion("Calle Falsa 123");
        cliente.setTelefono("987654321");

        MiniBodega miniBodega1 = new MiniBodega();
        miniBodega1.setNumeroSerie("A00001");
        miniBodega1.setTamanio("10x15x2 m");
        miniBodega1.setUbicacion("Ala Norte, tercer galpón");
        miniBodega1.setCliente(cliente);

        MiniBodega miniBodega2 = new MiniBodega();
        miniBodega2.setNumeroSerie("A00002");
        miniBodega2.setTamanio("12x20x3 m");
        miniBodega2.setUbicacion("Ala Sur, primer galpón");
        miniBodega2.setCliente(cliente);

        cliente.getMiniBodegas().add(miniBodega1);
        cliente.getMiniBodegas().add(miniBodega2);

        clienteRepositorio.save(cliente);

        Cliente clienteGuardado = clienteRepositorio.findById(cliente.getId()).orElse(null);
        assertNotNull(clienteGuardado);
        assertEquals(2, clienteGuardado.getMiniBodegas().size());
    }
}
