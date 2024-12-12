package org.example.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {



    /*public boolean obtenerConexion() {
        try {
            URL url = new URL("http://api.open-notify.org/iss-now.json");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            if (con.getResponseCode() == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String linea;
                while ((linea = br.readLine()) != null) {
                    sb.append(linea);
                }
                br.close();
                response = JsonParser.parseString(sb.toString()).getAsJsonObject();
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return false;
        }
    }

    public int obtenerStatus() {
        try {
            URL url = new URL("http://api.open-notify.org/iss-now.json");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            return con.getResponseCode();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public double obtenerLatitud() {
        try {
            URL url = new URL("http://api.open-notify.org/iss-now.json");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String linea;
            StringBuilder sb = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                sb.append(linea);
            }
            br.close();

            JsonObject localizacion = JsonParser.parseString(sb.toString()).getAsJsonObject();

            return localizacion.getAsJsonObject("iss_position").get("latitude").getAsDouble();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public double obtenerLongitud() {
        try {
            URL url = new URL("http://api.open-notify.org/iss-now.json");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String linea;
            StringBuilder sb = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                sb.append(linea);
            }
            br.close();

            JsonObject localizacion = JsonParser.parseString(sb.toString()).getAsJsonObject();

            return localizacion.getAsJsonObject("iss_position").get("longitude").getAsDouble();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public double obtenerIdConexion() {
        try {
            URL url = new URL("http://api.open-notify.org/iss-now.json");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String linea;
            StringBuilder sb = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                sb.append(linea);
            }
            br.close();

            JsonObject localizacion = JsonParser.parseString(sb.toString()).getAsJsonObject();

            return localizacion.get("timestamp").getAsLong();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }*/
}