/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
public final class PersonalServicio extends Empleados{
    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioInicio, int numeroDespacho, String nombre, String apellido, int id, String estadoCivil) {
        super(anioInicio, numeroDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()+"PersonalServicio{" + "seccion=" + seccion + '}';
    }
//    Traslado de sección de un empleado del personal de servicio.
    public void cambiarseccion(){
        System.out.println("ingrese la nueva seccion para el empleado");
        this.seccion=leer.next();
    }
    
}
