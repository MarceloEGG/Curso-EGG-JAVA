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
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        Scanner leer = new Scanner(System.in);
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        System.out.println(" A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }

}
