package org.example;

import domain.entities.Inscripcion;
import domain.entities.Materia;
import domain.entities.Alumno;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Materia analisis = new Materia("Análisis");
        Materia analisis2 = new Materia("Analisis2");
        Materia analisisSuperior = new Materia("AnalisisSuperior");

        analisis2.agregarCorrelativa(analisis);
        analisisSuperior.agregarCorrelativa(analisis2);

        Alumno manu = new Alumno("Manu");
        manu.aprobarMateria(analisis);

        Inscripcion inscripcion = new Inscripcion (manu, List.of(analisis2));
        System.out.println("El estado de la inscripcion es: " + inscripcion.aprobada());
        Inscripcion inscripcion2 = new Inscripcion(manu, List.of(analisisSuperior));
        System.out.println("El estado de la inscripcion es: " + inscripcion2.aprobada());

    }
}