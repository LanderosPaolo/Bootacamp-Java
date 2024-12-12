package org.example;

import org.example.helper.Helper;

public class App {
    public static void main( String[] args ) {

        Helper helper = new Helper();
        System.out.println("\nStatus conexión a servidores de la ISS:");
        System.out.println(helper.statusConexion(helper.conexionApi()));
        System.out.println("\nID de la conexión:");
        System.out.println(helper.idConexion(helper.conexionApi()));
        System.out.println("\nLatitud de la Estación Internacional:");
        System.out.println(helper.infoLat(helper.conexionApi()));
        System.out.println("\nLongitud de la Estación Internacional:");
        System.out.println(helper.infoLong(helper.conexionApi()));
    }
}
