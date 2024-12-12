package models;

public class Curso {
    private String nombreCurso;
    private String codigo;
    private String descripcion;

    public Curso(String nombreCurso, String codigo, String descripcion) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Curso [" +
                "nombre ='" + nombreCurso + '\'' +
                ", codigo ='" + codigo + '\'' +
                ", descripcion ='" + descripcion + '\'' +
                ']';
    }
}
