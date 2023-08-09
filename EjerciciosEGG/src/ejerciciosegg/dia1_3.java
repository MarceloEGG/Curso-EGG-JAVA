/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;
import java.util.Scanner;
/**
 * /*Escribir un programa que pida una frase y 
     la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
 /* @author MAR
 */
public class dia1_3 {
 public static void main(String[] args) {  
   String frase;
   System.out.println("Porfavor ingrese una frase ");
     Scanner leer = new Scanner(System.in);
      frase= leer.nextLine();
       System.out.println("Su nombre es: " + frase.toUpperCase());
        System.out.println("Su nombre es: " + frase.toLowerCase());
 } 
}
