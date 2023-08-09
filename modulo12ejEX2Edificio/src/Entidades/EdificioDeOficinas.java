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
public final class EdificioDeOficinas extends Edificio {
//    número de oficinas, cantidad de personas
//por oficina y número de pisos.
    private int numeroDeOficinas;
    private int PXoficina;
    private int numeroDePisos;
 Scanner leer = new Scanner(System.in);
    public EdificioDeOficinas() {
   
    }

    public EdificioDeOficinas(int numeroDeOficinas, int PXoficina, int numeroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.PXoficina = PXoficina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getPXoficina() {
        return PXoficina;
    }

    public void setPXoficina(int PXoficina) {
        this.PXoficina = PXoficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }
    
    public EdificioDeOficinas CrearEdificioDeOficinas(ArrayList <Edificio> lugares){
        EdificioDeOficinas e1 = new EdificioDeOficinas();
//        (int numeroDeOficinas, int PXoficina, int numeroDePisos, double ancho, double alto, double largo) {
//        super(ancho, alto, largo);
//        this.numeroDeOficinas = numeroDeOficinas;
//        this.PXoficina = PXoficina;
//        this.numeroDePisos = numeroDePisos;
System.out.println("ingrese numero de oficinas x piso");
        e1.numeroDeOficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina");
e1.PXoficina=leer.nextInt();
        System.out.println("Ingrese Numero de pisos");
        e1.numeroDePisos= leer.nextInt();
                System.out.println("ingrese ancho");
e1.ancho = leer.nextDouble();
        System.out.println("Ingrese alto");
        e1.largo=leer.nextDouble();
        System.out.println("Ingrese largo");
        e1.largo=leer.nextDouble();
        lugares.add(e1);
return e1;
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
    public void calcularpersonas(){
       int aux= this.PXoficina*this.numeroDeOficinas*this.numeroDePisos;
       int aux2= this.PXoficina*this.numeroDeOficinas;
        System.out.println("La cantidad de personas posibles por oficina es de:"+ aux2+"\n"+ "El total de personas en el edificio puede ser de: "+aux);
    }
}
