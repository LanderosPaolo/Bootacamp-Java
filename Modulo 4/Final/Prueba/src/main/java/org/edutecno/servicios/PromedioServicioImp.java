package org.edutecno.servicios;

import java.util.List;

public class PromedioServicioImp {
    public Double calcularPromedio(List<Integer> notas) {
        if(notas == null || notas.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for(Integer nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
