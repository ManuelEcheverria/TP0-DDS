package domain.entities;

import java.util.List;
import java.util.*;

public class Alumno {
    private String nombre;
    private Set<Materia> aprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.aprobadas = new HashSet<>();
    }

    public void aprobarMateria(Materia materia) {
        aprobadas.add(materia);
    }

    public boolean materiaAprobada(Materia materia) {
        return aprobadas.contains(materia);
    }

}
