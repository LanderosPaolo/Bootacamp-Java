package modelsAdministrador;

public class Administrador {
    private static Administrador instance;
    private String nombre;

    private Administrador() {
    }

    public static Administrador getInstance() {
        if (instance == null) {
            instance = new Administrador();
        }
        return instance;
    }

    //Metodo para inicializar
    public void inicializar(String nombre) {
        if (this.nombre == null) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }
}
