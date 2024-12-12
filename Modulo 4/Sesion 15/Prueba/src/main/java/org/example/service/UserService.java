package org.example.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UserService {

    public void obtenerLocalizacion() {
        // INGRESE LA URL NECESARIA
        //PAGINA PARA OBTENER URL
        // https://ipbase.com/
        String urlLocalizacion = "https://api.ipbase.com/v2/info?apikey=sgiPfh4j3aXFR3l2CnjWqdKQzxpqGn9pX5b3CUsz&ip=2803:c180:2100:983a:5cec:3751:1fab:2232";

        try {
            URL url = new URL(urlLocalizacion);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea;
            StringBuilder sb = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                sb.append(linea);
            }

            br.close();

            //Procesar JSON
            JsonObject localizacion = JsonParser.parseString(sb.toString()).getAsJsonObject();

            //Obtener ciudad
            System.out.println("ciudad: " + localizacion.getAsJsonObject("data")
                    .getAsJsonObject("location")
                    .getAsJsonObject("city")
                    .get("name").getAsString());
            //Obtener region
            System.out.println("region: " + localizacion.getAsJsonObject("data")
                    .getAsJsonObject("location")
                    .getAsJsonObject("region")
                    .get("name").getAsString());
            //Obtener pais
            System.out.println("pais: " + localizacion
                    .getAsJsonObject("data")
                    .getAsJsonObject("location")
                    .getAsJsonObject("country")
                    .get("name").getAsString());
            //Obtener continente
            System.out.println("continente: " + localizacion.getAsJsonObject("data")
                    .getAsJsonObject("timezone")
                    .get("id").getAsString());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}