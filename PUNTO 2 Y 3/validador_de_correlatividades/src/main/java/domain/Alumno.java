package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void agregarMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean aproboCorrelativas(Materia materia) {
        return this.materiasAprobadas.containsAll(materia.getMateriasCorrelativas());
    }
}
