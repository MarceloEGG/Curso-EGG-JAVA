/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author MAR
 */
public abstract class Edificio {
    // ancho, alto y largo

    protected double ancho;
    protected double alto;
    protected double largo;

    public double calcularSuperficie(double ancho,double largo) {
        double volumen=0;
        return  volumen;
    }

    public double calcularvolumen(double ancho,double alto,double largo) {
 double superfice=0;
        return  superfice;
    }

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
}
