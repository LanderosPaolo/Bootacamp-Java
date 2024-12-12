package org.edutecno.servicios;

import org.edutecno.modelos.Alumno;
import org.edutecno.modelos.Materia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArchivoServicio {
    private List<Alumno> alumnosACargar;
    private PromedioServicioImp promediosServicioImp = new PromedioServicioImp();

    public void exportarDatos(List<Alumno> alumnos, String nombreArchivo) {
        //EL ARCHIVO SE CREARA AUTOMATICAMENTE EN LA CARPETA DEL PROYECTO.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Alumno alumno : alumnos) {
                writer.write("\nAlumno: " + alumno.getNombre() + " " + alumno.getApellido() + "\n");
                writer.write("RUT: " + alumno.getRut() + "\n");

                writer.write("Materias: \n");
                for (Materia materia : alumno.getListaMaterias()) {
                    writer.write(" - " + materia.getNombre() + "\n");
                    writer.write("   Notas: " + materia.getNotasAlumno() + "\n");
                    writer.write("- Promedio: " + promediosServicioImp.calcularPromedio(materia.getNotasAlumno()));
                }

                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al exportar los datos: " + e.getMessage());
        }
    }
}