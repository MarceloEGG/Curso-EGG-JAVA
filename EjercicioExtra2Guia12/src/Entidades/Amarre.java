/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
public class Amarre {
    private Barco Barco;
    private String nombreC;
    private String dni;
    private int fechaIngreso;
    private int fechaEgreso;
    private String posicionAmarre;

    public Amarre() {
    }

    public Amarre(Barco Barco, String nombreC, String dni, int fechaIngreso, int fechaEgreso, String posicionAmarre) {
        this.Barco = Barco;
        this.nombreC = nombreC;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.posicionAmarre = posicionAmarre;
    }
    
}
