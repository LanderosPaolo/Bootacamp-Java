package models;

public class Singleton {
    //Variable estatica y privada donde se almacenara la instancia
    private static Singleton instance;

    //contructor vacio y privado
    private Singleton(){}

    //Metodo estatico para acceder a la instancia o crearla si no existe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Instancia creada");
        } else {
            System.out.println("Llamada al Singleton");
        }
        return instance;
    }
}
