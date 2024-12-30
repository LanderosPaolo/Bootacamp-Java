package org.edutecno.prueba.dto;


import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private int id;
    private String nombre;
    private String username;
    private String email;
    private Date fechaNacimiento;
    private String password;
    private String animal;

    public Usuario(int id, String nombre, String username, String email, Date fechaNacimiento, String password, String animal) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
        this.animal = animal;
    }

    public Usuario() {
    }

    public String obtenerAnimal() {
        int anio = this.fechaNacimiento.toLocalDate().getYear();
        int resto = anio % 12;

        // Mapa de animales del horóscopo chino
        Map<Integer, String> horoscopoMap = new HashMap<>();
        horoscopoMap.put(0, "Mono");
        horoscopoMap.put(1, "Gallo");
        horoscopoMap.put(2, "Perro");
        horoscopoMap.put(3, "Cerdo");
        horoscopoMap.put(4, "Rata");
        horoscopoMap.put(5, "Buey");
        horoscopoMap.put(6, "Tigre");
        horoscopoMap.put(7, "Conejo");
        horoscopoMap.put(8, "Dragon");
        horoscopoMap.put(9, "Serpiente");
        horoscopoMap.put(10, "Caballo");
        horoscopoMap.put(11, "Cabra");

        return horoscopoMap.get(resto);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", password='" + password + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}
