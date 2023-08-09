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
public class extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int impares=0, pares=0, num;
        System.out.println("Ingrese números enteros");
        Scanner leer = new Scanner(System.in);
        do{
         num = leer.nextInt();
            if (num>0) {
              if (num % 2 == 0) {
                pares++;
            }else{
                impares++;
            }  
            }
            
        }while(num % 5 !=0);
        System.out.println("Usted ingresó " + pares + " pares");
        System.out.println("Usted ingresó " + impares + " impares");
        System.out.println("Usted ingresó " + (pares + impares)+ " números positivos");
    }
    
}
