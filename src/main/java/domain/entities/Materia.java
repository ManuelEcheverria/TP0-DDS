package domain.entities;

import java.util.*;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa (Materia materia) {
        correlativas.add(materia);
    }
}
