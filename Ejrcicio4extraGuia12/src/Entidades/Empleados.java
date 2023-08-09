/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
public class Empleados extends Personas {
    protected int anioInicio, numeroDespacho;

    public Empleados(int anioInicio, int numeroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioInicio = anioInicio;
        this.numeroDespacho = numeroDespacho;
    }

    public Empleados() {
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
       
        return  super.toString()+ "Empleados{" + "anioInicio=" + anioInicio + ", numeroDespacho=" + numeroDespacho + '}';
    }
  public void cambiarDespacho(){
      System.out.println("Ingrese el nuevo despacho");
      this.numeroDespacho=leer.nextInt();
  }
}
