/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
public final class Profesor extends Empleados{
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioInicio, int numeroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioInicio, numeroDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }



    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "departamento=" + departamento + '}';
    }
//Cambio de departamento de un profesor.
   public void cambioDepartamento(){
       System.out.println("Ingrese el nuevo departamento");
       this.departamento=leer.next();
   }
    
}
