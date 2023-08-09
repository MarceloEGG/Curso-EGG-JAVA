/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 * Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
 * de identificación y su estado civil.
 */
public class Personas {

    protected String nombre, apellido;
    protected int id;
    protected String estadoCivil;
   final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Personas() {
    }

    public Personas(String nombre, String apellido, int id, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return  "nombre:" + nombre+ ", " + apellido +"\n"+  ", estadoCivil:" + estadoCivil;
    }
//    Cambio del estado civil de una persona.

    public void cambiarEstadoCivil() {

        if (estadoCivil.equalsIgnoreCase("casado")) {
            this.estadoCivil = "soltero";

        } else {
            this.estadoCivil = "casado";
        }

    }
}
