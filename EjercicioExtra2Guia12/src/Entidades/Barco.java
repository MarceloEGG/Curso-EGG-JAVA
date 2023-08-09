/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class Barco {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected int matricula, eslora, anio, modulo;

    public Barco() {
        
    }

    public Barco(int matricula, int eslora, int anio, int modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
        this.modulo =modulo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Barco\n" + "matricula: " + matricula + "\n" + "eslora:" + eslora + "\n" + "año de fabricación" + anio+"\n" +modulo;
    }

   public void modulo() {
       this.modulo = this.eslora * 10;
       
    }

    public void  crearBarco() {

        System.out.println("ingrese numero de matriclua");
        this.matricula = leer.nextInt();
        System.out.println("ingrese el tamaño de la esora");
        this.eslora = leer.nextInt();
        System.out.println("ingrese el año del barco");
        this.anio = leer.nextInt();

       
    }
}
