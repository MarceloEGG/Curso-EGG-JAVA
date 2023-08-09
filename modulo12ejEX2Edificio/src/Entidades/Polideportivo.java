/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public final class Polideportivo extends Edificio {
   
    private String nombre;
    private boolean techado;

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Polideportivo() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    public Polideportivo crearPolideportivo(ArrayList <Edificio> lugares){
        Polideportivo p1=new Polideportivo();
        System.out.println("ingrese nombre del lugar");
        p1.nombre=leer.next();
//            private String nombre;
System.out.println("Indique si el lugar esta techado (SI) (NO)");
String auxtechado=leer.next();
p1.techado = auxtechado.equalsIgnoreCase("SI");
        System.out.println("ingrese ancho");
p1.ancho = leer.nextDouble();
        System.out.println("Ingrese alto");
        p1.largo=leer.nextDouble();
        System.out.println("Ingrese largo");
        p1.largo=leer.nextDouble();
        lugares.add(p1);
     return p1;
//    private boolean techado;
//    public Polideportivo(double ancho, double alto, double largo) {
//        super(ancho, alto, largo);
}

      @Override
    public double calcularvolumen(double ancho, double alto, double largo) {
    double volumen= largo*ancho*alto;
    return volumen;
    }

    @Override
    public double calcularSuperficie(double ancho, double largo) {
         double superficie= largo*ancho;
         return superficie;
    }

   
}
