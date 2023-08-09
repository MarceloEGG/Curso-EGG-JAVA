/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoeegdia3;
import java.util.Scanner;
/**
 *Escriba un programa que valide si una nota está entre 0 y 10, 
 * sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
 * la nota sea correcta.

 * @author MAR
 */
public class teoriawhile {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int num1=-1;
         while (num1 <0 || num1 >10){
         System.out.println ("ingrese un numero");
             num1 = leer.nextInt();
         }
         System.out.println ("la nota es correcta");

         
         
         
         }
}