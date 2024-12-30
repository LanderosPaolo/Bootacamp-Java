package org.edutecno.ejercicio;

import org.edutecno.ejercicio.controller.Profesor;
import org.edutecno.ejercicio.model.Alumno;
import org.edutecno.ejercicio.service.impl.CalculadoraPrin;
import org.edutecno.ejercicio.service.impl.CalculadoraSinAyB;
import org.edutecno.ejercicio.service.impl.CalculadoraSinRojos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private Profesor profesor;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno("15562563", "HeathSchowalter", Arrays.asList(6, 7, 2), 0f));
        alumnos.add(new Alumno("13635430", "RozellaBartoletti", Arrays.asList(3, 2, 6, 6, 6, 4, 3, 3, 4), 0f));
        alumnos.add(new Alumno("17554475", "JedRunolfsdottir", Arrays.asList(2, 5, 3, 6, 2, 1, 7, 2), 0f));
        alumnos.add(new Alumno("15911676", "NadiaRomaguera", Arrays.asList(2, 4, 2, 7, 4, 2, 5), 0f));
        alumnos.add(new Alumno("15257972", "DelaneyKing", Arrays.asList(4, 2, 7, 3, 5, 5), 0f));
        alumnos.add(new Alumno("12903628", "JermainGleason", Arrays.asList(2, 3, 6, 3, 2, 6, 6, 6, 4, 5), 0f));
        alumnos.add(new Alumno("17289139", "AmiraCummings", Arrays.asList(6, 4, 2, 2, 4, 4), 0f));
        alumnos.add(new Alumno("11937304", "ColbyDaugherty", Arrays.asList(2, 3, 3, 4, 5, 3, 7, 4, 3), 0f));
        alumnos.add(new Alumno("19494989", "MicheleAdams", Arrays.asList(3, 4), 0f));
        alumnos.add(new Alumno("16858319", "FelicitaTromp", Arrays.asList(5, 2), 0f));
        alumnos.add(new Alumno("15731640", "ScottyPacocha", Arrays.asList(6, 4, 2), 0f));
        alumnos.add(new Alumno("12900399", "RansomDenesik", Arrays.asList(6, 6, 5), 0f));
        alumnos.add(new Alumno("12756544", "RockyWyman", Arrays.asList(3), 0f));
        alumnos.add(new Alumno("15653448", "EmiliaBlock", Arrays.asList(6, 7, 6, 3, 5, 3, 4, 3), 0f));
        alumnos.add(new Alumno("16790751", "LaurenTrantow", Arrays.asList(3, 3, 5, 1, 3, 5, 1, 6, 4, 6), 0f));
        alumnos.add(new Alumno("18766487", "TessiePacocha", Arrays.asList(2, 3, 4, 5), 0f));
        alumnos.add(new Alumno("11988765", "GeovannyRippin", Arrays.asList(5, 4, 4, 2, 3), 0f));
        alumnos.add(new Alumno("12352553", "AlexanderBerge", Arrays.asList(6, 6, 4, 2, 4, 2, 6), 0f));
        alumnos.add(new Alumno("19886598", "MauriceZboncak", Arrays.asList(4, 2, 4, 3, 2, 5, 1), 0f));
        alumnos.add(new Alumno("18939934", "KenHaley", Arrays.asList(6, 7, 2, 1), 0f));

        ((CalculadoraPrin) profesor.getCalculadora()).setAlumnos(alumnos);
        //((CalculadoraSinRojos) profesor.getCalculadora()).setAlumnos(alumnos);
        //((CalculadoraSinAyB) profesor.getCalculadora()).setAlumnos(alumnos);

        profesor.mostrarPromedio();
    }
}
