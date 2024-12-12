import models.DirectorTecnico;
import models.Equipo;
import models.Jugador;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        equipo.agregarPersona(new DirectorTecnico("Reinaldo", "Rueda", 63, 2));
        equipo.agregarPersona(new Jugador("Claudio", "Bravo", 37, 1, "Portero"));
        equipo.agregarPersona(new Jugador("Gary", "Medel", 33, 17, "Central"));
        equipo.agregarPersona(new Jugador("Alexis", "Sanchez", 31, 7, "Delantero"));
        //*Se pueden agregar mas jugadores a la lista.*


        //Mostrar el equipo
        equipo.mostrarEquipo();
    }
}