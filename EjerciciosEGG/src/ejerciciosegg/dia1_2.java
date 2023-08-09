package ejerciciosegg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author MAR
 */

    /**
     * @param args the command line arguments
     */
    
/**Escribir un programa que pida tu nombre, 
 * lo guarde en una variable y lo muestre por pantalla.
 *
 * @author MAR
 */
public class dia1_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
       nombre= leer.next();
       System.out.println ("Su nombre es " +nombre);
    }
}
