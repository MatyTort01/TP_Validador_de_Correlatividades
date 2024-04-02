package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public void agregarMaterias(Materia ... materias) {
        Collections.addAll(this.materias, materias);
    }

    public boolean materiaAprobada(Materia materia){
        // Devuelve si el alumno que realizo la inscripcion tiene todas las correlativas pertintentes a la materia pasada por parametro aprobadas
        return this.alumno.aproboCorrelativas(materia);
    }

    public boolean aprobada(){
        // Para que la inscripcion sea aprobada el alumno debe tener TODAS las correlativas aprobadas de CADA materia de la lista de materias de la inscripcion.
        return this.materias.stream().allMatch(materia -> this.materiaAprobada(materia));
    }
}
