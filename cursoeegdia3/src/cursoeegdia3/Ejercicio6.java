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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2;
        int opc;
        boolean bucle = true;
        do {
            System.out.println("Ingrese dos numeros positivos porfa");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while (num1 < 0 || num2 < 0);
        do {
            System.out.println("********MENU********* ");
            System.out.println("1 . Sumar  ");
            System.out.println("2. Restar  ");
            System.out.println("3. Multiplicar  ");
            System.out.println("4. Dividir  ");
            System.out.println("5. Salir  ");
            System.out.println("Digite la opcion deseada -> ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println(suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println(resta);
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println(multi);
                    break;
                case 4:
                    int div = num1 / num2;
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere salir? (S/N)");
                    String salir = leer.next();
                    if (salir.equalsIgnoreCase("S")) {
                        System.out.println("Muchas gracias por participar");
                        bucle = false;
                    }
                    break;
                default:
                    System.out.println("No tengo registrado ese numerito :C");
                    break;
            }
        } while (bucle);
    }
}
