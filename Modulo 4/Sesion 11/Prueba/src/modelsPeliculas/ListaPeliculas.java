package modelsPeliculas;

import java.util.ArrayList;

public class ListaPeliculas {
    private ArrayList<Pelicula> peliculas;

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public ListaPeliculas() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula p) {
        this.peliculas.add(p);
    }

    public void mostrarTotalPeliculas() {
        for (Pelicula p : peliculas) {
            System.out.println("- " + p.getTitulo());
        }
    }

    public void mostrarPeliculasDisponibles() {
        for (Pelicula p : peliculas) {
            if (p.isDisponible() == true) {
                System.out.println("- " + p.getTitulo() + " (" + p.arrendada() + ")");
            }
        }
    }
}
