package com.mycompany.app;

import java.util.List;

public class Curso {

    private List<Alumno> alumnos;
    private Profesor profesor;

    public Curso(List<Alumno> alumnos, Profesor profesor) {
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    public Curso(Profesor profesor) {
        this.profesor = profesor;
    }

    public Profesor getProfesor(){
        return this.profesor;
    }
}
