package org.example.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BromaService {
    public void obtenerBroma() {
        String urlBroma = "https://official-joke-api.appspot.com/random_joke";

        try {
            URL url = new URL(urlBroma);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            //Leer respuesta
            BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String linea;
            StringBuilder sb = new StringBuilder();

            while ((linea = br.readLine()) != null) {
                sb.append(linea);
            }

            br.close();

            //Procesar JSON
            JsonObject post = JsonParser.parseString(sb.toString()).getAsJsonObject();
            //Mostrar chiste
            System.out.println(post.get("setup").getAsString());
            //Moostrar respuesta al chiste
            System.out.println(post.get("punchline").getAsString());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void obtenerBromas () {
        String urlBromas = "https://official-joke-api.appspot.com/random_ten";

        try {
            URL url = new URL(urlBromas);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String linea;
            StringBuilder sb = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                sb.append(linea);
            }
            br.close();
            JsonArray bromas = JsonParser.parseString(sb.toString()).getAsJsonArray();

            for (int i = 1; i < bromas.size(); i++) {
                System.out.println("\nJoke number: " + i);
                System.out.println(bromas.get(i).getAsJsonObject().get("setup").getAsString());
                System.out.println(bromas.get(i).getAsJsonObject().get("punchline").getAsString());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}