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
public class ejercicio11teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros");
Scanner leer = new Scanner(System.in);
int num1=leer.nextInt();
int num2=leer.nextInt();
EsMultiplo (num1,num2);

    }
    public static void EsMultiplo (int x , int y) {
    if (x%y == 0 ){
        System.out.println("los numero son multiplos");
    }else{
        System.out.println("Los numeros no son multiplos");
    }
}
}
