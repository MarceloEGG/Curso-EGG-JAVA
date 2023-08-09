/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoeegdia3;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 *
 * @author MAR
 */
public class extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantos numeros desea ingresar");
        int n = leer.nextInt();

        int num;
        int cont = 0;
        int suma = 0;
        int min = 0;
        int max = 0;

        System.out.println("Elija version de programa 1- while 2- do wile");
        int version = leer.nextInt();
        switch (version) {
            case 1:
                System.out.println("Ingrese " + n + " numeros");
                while (cont != n) {
                    num = leer.nextInt();
                    suma += num;
                    cont++;
                    if (cont == 1) {
                        min = num;
                        max = num;
                    } else {
                        min = Math.min(min, num);
                        max = Math.max(max, num);
                    }
                }
                System.out.println("Elpromedio de los numeros ingresados es " + suma / n);
                System.out.println("El valor minimo ingresado es " + min);
                System.out.println("El valor maximo ingresado es " + max);
                break;
            case 2:
                System.out.println("Ingrese " + n + " numeros");
                do {
                    num = leer.nextInt();
                    suma += num;
                    cont++;
                    if (cont == 1) {
                        min = num;
                        max = num;
                    } else {
                        min = Math.min(min, num);
                        max = Math.max(max, num);
                    }

                } while (!(cont == n));
                System.out.println("Elpromedio de los numeros ingresados es " + suma / n);
                System.out.println("El valor minimo ingresado es " + min);
                System.out.println("El valor maximo ingresado es " + max);
                break;
            default:
                System.out.println("eran dos opciones no jodas!!!");
                ;
        }

    }

}
