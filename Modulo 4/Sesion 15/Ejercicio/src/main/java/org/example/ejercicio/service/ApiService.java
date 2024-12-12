package org.example.ejercicio.service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ApiService {
    public String obtenerUnaBroma() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://official-joke-api.appspot.com/random_joke");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        Response response = builder.get();
        return response.readEntity(String.class);
    }

    public String obtenerBromas() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://official-joke-api.appspot.com/random_ten");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        Response response = builder.get();
        return response.readEntity(String.class);
    }
}

