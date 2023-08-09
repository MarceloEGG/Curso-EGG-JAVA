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
public class extra5 {

        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la categoria del socio A,B,C ");
            System.out.println("Ingrese el valor del tratamiento");
            String categoria = leer.nextLine();
            int valor = leer.nextInt();
            if (categoria.equalsIgnoreCase("a")) {
                System.out.println("El valor del tratamiento es " + valor * 0.5);
            } else if (categoria.equalsIgnoreCase("b")) {
                System.out.println("El valor del tratamiento es " + valor * 0.65);
            } else if (categoria.equalsIgnoreCase("b")) {
                System.out.println("El valor del tratamiento es " + valor * 0.65);
            }
        }
    
}
