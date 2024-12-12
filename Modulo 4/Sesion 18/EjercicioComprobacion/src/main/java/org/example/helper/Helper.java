package org.example.helper;

import org.example.models.Respuesta;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Helper {

    public Respuesta conexionApi() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://api.open-notify.org").path("iss-now.json");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        Response response = builder.get();
        return response.readEntity(new GenericType<Respuesta>() {});
    }

    public String statusConexion(Respuesta respuesta) {
        return respuesta.getMessage();
    }

    public int idConexion(Respuesta respuesta) {
        return respuesta.getTimestamp();
    }

    public String infoLat(Respuesta respuesta) {
        return respuesta.iss_position.getLatitude();
    }

    public String infoLong(Respuesta respuesta) {
        return respuesta.iss_position.getLongitude();
    }
}
