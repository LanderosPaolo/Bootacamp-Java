package org.edutecno.prueba.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "forma_pago")
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID_FORMA_PAGO")
    private int idFormaPago;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "RECARGA")
    private String recarga;

    public FormaPago() {
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRecarga() {
        return recarga;
    }

    public void setRecarga(String recarga) {
        this.recarga = recarga;
    }

    @Override
    public String toString() {
        return "FormasPago{" +
                "idFromaPago=" + idFormaPago +
                ", descripcion='" + descripcion + '\'' +
                ", recarga='" + recarga + '\'' +
                '}';
    }
}
