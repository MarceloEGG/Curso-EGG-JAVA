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
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El Numero es par");
        } else {
            System.out.println("El Numero es Impar");
        }
    }
}
