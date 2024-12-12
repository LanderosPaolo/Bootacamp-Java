package org.example;

import org.example.models.Jugador;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.example.models.EquipoBasket;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@DisplayName("Test para las clases Jugador y EquipoBasket")
public class AppTest {
    @Test
    @DisplayName("Test para verificar crearEquipo()")
    void testVerificarCrearEquipo() {
        EquipoBasket equipoMock = mock(EquipoBasket.class);

        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(new Jugador("Jugador1", 20, 999));

        EquipoBasket equipo = equipoMock.crearEquipo("NombreEquipo", "Ciudad", listaJugadores);

        when(equipoMock.crearEquipo("NombreEquipo", "Ciudad", listaJugadores))
                .thenReturn(equipo);

        verify(equipoMock).crearEquipo("NombreEquipo", "Ciudad", listaJugadores);
    }

    @Test
    @DisplayName("Test para verificar crearJugador()")
    void testVerificarCrearJugador() {
        Jugador jugadorMock = mock(Jugador.class);

        Jugador jugador = jugadorMock.crearJugador("Jugador1", 20, 999);

        when(jugadorMock.crearJugador("Jugador1", 20, 999))
                .thenReturn(jugador);

        verify(jugadorMock).crearJugador("Jugador1", 20, 999);
    }

    @Test
    @DisplayName("Test crearEquipo()")
    void testCrearEquipo() {
        EquipoBasket equipoMock = mock(EquipoBasket.class);

        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores.add(new Jugador("Jugador1", 20, 999));
        listaJugadores.add(new Jugador("Jugador2", 19, 998));

        equipoMock.crearEquipo("NombreEquipo", "Ciudad", listaJugadores);

        verify(equipoMock).crearEquipo("NombreEquipo", "Ciudad", listaJugadores);
    }

    @Test
    @DisplayName("Test crearJugador()")
    void testCrearJugador() {
        Jugador jugadorMock = mock(Jugador.class);

        when(jugadorMock.crearJugador("Jugador1", 20, 999))
                .thenReturn(new Jugador("Jugador1", 20, 999));

        jugadorMock.crearJugador("Jugador1", 20, 999);

        verify(jugadorMock).crearJugador("Jugador1", 20, 999);
    }
}