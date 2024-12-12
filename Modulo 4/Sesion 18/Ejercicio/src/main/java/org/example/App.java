package org.example;


import org.example.service.ApiService;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class App {
    public static void main(String[] args) {

        /*ApiService apiService = new ApiService();
        apiService.obtenerStatus();*/

        System.out.println(statusConection(conexionApi()));
        System.out.println(idConeccion(conexionApi()));
        System.out.println(infoLat(conexionApi()));
        System.out.println(infoLong(conexionApi()));

    }

    public static String statusConection(Respuesta posicionIss) {
        return posicionIss.getMessage();
    }

    public static int idConeccion(Respuesta posicionIss) {
        return posicionIss.getTimestamp();
    }

    public static String infoLat(Respuesta posicionIss) {
        return posicionIss.getIss_position().getLatitude();
    }

    public static String infoLong(Respuesta posicionIss) {
        return posicionIss.getIss_position().getLongitude();
    }

    public static Respuesta conexionApi() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://api.open-notify.org").path("iss-now.json");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        Response response = builder.get();
        return response.readEntity(new GenericType<Respuesta>() {
        });
    }
}
