package org.edutecno.ejercicio.entidad;

import jakarta.persistence.*;

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private String comuna;
    private String region;

    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Direccion(Long id, String calle, String comuna, String region, Persona persona) {
        this.id = id;
        this.calle = calle;
        this.comuna = comuna;
        this.region = region;
        this.persona = persona;
    }

    public Direccion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", comuna='" + comuna + '\'' +
                ", region='" + region + '\'' +
                ", persona=" + persona +
                '}';
    }
}
