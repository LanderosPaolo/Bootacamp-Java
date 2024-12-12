package org.example.practicando;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.example.practicando.modelo.Publicacion;

import java.util.List;

@SpringBootApplication
public class PracticandoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticandoApplication.class, args);

        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("https://jsonplaceholder.typicode.com/").path("posts");

        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

        Response respuestaPublicaciones = invocationBuilder.get();

        List<Publicacion> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Publicacion>>() {
        });

        System.out.println(listaPublicaciones.get(0));
    }
}
