package model;

public class Persona {
    private String usuario;
    private String contrasena;

    public Persona(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
