package org.example.models;

import java.util.List;

public class EquipoBasket {
    private String nombreEquipo;
    private String ciudad;
    private List<Jugador> listaJugadores;

    public EquipoBasket(String nombreEquipo, String ciudad, List<Jugador> listaJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "EquipoBasket{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", listaJugadores=" + listaJugadores +
                '}';
    }

    //Metodo crearEquipo
    public EquipoBasket crearEquipo(String nombreEquipo, String ciudad, List<Jugador> listaJugadores) {
        return new EquipoBasket(nombreEquipo, ciudad, listaJugadores);
    }
}
