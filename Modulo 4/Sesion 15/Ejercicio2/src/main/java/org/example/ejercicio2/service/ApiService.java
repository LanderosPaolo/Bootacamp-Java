package org.example.ejercicio.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class ApiService {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public ApiService() {
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    public String obtenerUnaBroma() throws IOException {
        // Realiza la solicitud a la API y obtiene la respuesta JSON como String
        String jsonResponse = restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke", String.class);

        // Analiza el JSON para extraer "setup" y "punchline"
        JsonNode jokeNode = objectMapper.readTree(jsonResponse);
        String setup = jokeNode.get("setup").asText();
        String punchline = jokeNode.get("punchline").asText();

        // Retorna la broma en formato concatenado
        return setup + " - " + punchline;
    }

    public String obtenerBromas() throws IOException {
        String jsonResponse = restTemplate.getForObject("https://official-joke-api.appspot.com/random_ten", String.class);

        JsonNode jokesNode = objectMapper.readTree(jsonResponse);
        StringBuilder result = new StringBuilder();

        // Itera sobre cada broma y extrae "setup" y "punchline"
        for (JsonNode joke : jokesNode) {
            String setup = joke.get("setup").asText();
            String punchline = joke.get("punchline").asText();
            result.append(setup).append(" - ").append(punchline).append("\n");
        }

        return result.toString();
    }
}

