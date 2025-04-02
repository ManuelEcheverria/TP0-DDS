package domain.entities;

import java.util.List;

public class Inscripcion {
    private List<Materia> inscripciones;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, List<Materia> inscripciones ) {
        this.alumno = alumno;
        this.inscripciones = inscripciones;
    }

    public boolean aprobada() {
        for (Materia materia : inscripciones) {
            for (Materia correlativa : materia.getCorrelativas()) {
                if (!alumno.materiaAprobada(correlativa)) {
                    return false;
                }
            }
        }
        return true;
    }
}