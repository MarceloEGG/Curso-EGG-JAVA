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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


        Scanner leer = new Scanner(System.in);
        System.out.println("Defina el limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        System.out.println("Ingrese numeros hasta llegar al limite");
        do {
            suma = suma + leer.nextInt();
        } while (suma <= limite);
        System.out.println("Supero el limite");
        System.out.println("El valor de la suma es :" + suma);
    }
}

    

