package com.mycompany.app;

public class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Profesor() {
    }
}
