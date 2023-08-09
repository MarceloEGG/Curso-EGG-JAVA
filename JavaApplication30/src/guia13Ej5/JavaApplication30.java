/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13Ej5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAle=random.nextInt(100)+1;
        int contador=0;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        while (true) {            
            System.out.println("Ingrese un numero");
            try{
                int numUs=leer.nextInt();
                contador++;
                if(numUs==numeroAle){
                    System.out.println("Felicitaciones adivinaste el numero "+ "Usaste " + contador +" intentos");
                    break;
                }else if (numUs<numeroAle){
                    System.out.println("No adivinaste el numero que buscas es mayor llevas "+contador+" intentos");
                }else 
                    System.out.println("No adivinaste el numero que buscas es menor llevas "+contador+" intentos");
            }catch(InputMismatchException e){
                System.out.println("La opcion ingresada no es valida por favor vuelve a intentarlo llevas "+contador+" intentos");
               leer.next();
                contador++;
               
            }
        }
    }
    
}
