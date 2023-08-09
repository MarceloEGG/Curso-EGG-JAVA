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
public class extra2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos ->");
        int min = leer.nextInt();
        int dia = min / (24 * 60);
        int hora = (min % (24 * 60) / 60);
        System.out.println(" La cantidad de dias es : " + dia + " la cantidad de hora es : " + hora);
    }
}

