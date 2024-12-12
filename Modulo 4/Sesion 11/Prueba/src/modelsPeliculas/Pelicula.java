package modelsPeliculas;

import interfacesPelicula.PeliculasInterface;

public class Pelicula implements PeliculasInterface {
    private String titulo;
    private int anioEstreno;
    private boolean disponible;

    public Pelicula(String titulo, int anioEstreno, boolean disponible) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String arrendada() {
        if(disponible == true) {
            return "Disponible para arrendar";
        }
        return "No disponible";
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}