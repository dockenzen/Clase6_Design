package com.example.alumno.telefono;

/**
 * Created by alumno on 27/04/2017.
 */

public class Persona
{
    private String nombre;
    private String apellido;

    public Persona(String nom, String ape){
        this.apellido = ape;
        this.nombre = nom;
    }

    public String getNombre(){return  this.nombre;}
    public String getApellido(){return  this.apellido;}

}
