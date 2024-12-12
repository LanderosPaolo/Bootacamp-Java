public class Gato <T> {
    T nombre;
    public Gato(T nombre) {
        super();
        this.nombre = nombre;
    }
    public T getNombre() {
        return nombre;
    }
    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre=" + nombre +
                '}';
    }
}
