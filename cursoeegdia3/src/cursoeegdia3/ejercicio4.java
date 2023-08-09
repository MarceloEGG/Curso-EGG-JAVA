/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoeegdia3;

import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class ejercicio4 {

    public static void main(String[] args) {
  
        Scanner leer = new Scanner(System.in);
        System.out.println("Porfavor ingrese una frase o palabra");
        String frase = leer.nextLine();
        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
