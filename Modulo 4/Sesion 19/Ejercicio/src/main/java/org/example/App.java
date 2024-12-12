package org.example;

import org.example.models.EquipoBasket;
import org.example.models.Jugador;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        //Crear instancia vacia
        Jugador jugador = new Jugador("", 0, 0);

        //crear jugador con el metodo
        Jugador jugador1 = jugador.crearJugador("Jugador1", 20, 999);
        Jugador jugador2 = jugador.crearJugador("Jugador2", 19, 998);

        //Agregar a la lista
        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);

        //Crear equipo
        EquipoBasket equipo = new EquipoBasket("", "", new ArrayList<>());
        EquipoBasket equipoBasket = equipo.crearEquipo("nombreEquipo", "Ciudad", listaJugadores);

        System.out.println(equipoBasket);
    }
}
