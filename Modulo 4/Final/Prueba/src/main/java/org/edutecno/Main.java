package org.edutecno;

import org.edutecno.modelos.Alumno;
import org.edutecno.vistas.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        List<Alumno> alumnos = new ArrayList<>();

        menu.iniciarMenu(alumnos);
    }
}