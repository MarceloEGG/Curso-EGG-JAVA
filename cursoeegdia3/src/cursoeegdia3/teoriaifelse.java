/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoeegdia3;
import java.util.Scanner;
/**
 *Implementar un programa que le pida dos números enteros al usuario 
 * y determine si ambos o alguno de ellos es mayor a 25.
 * @author MAR
 */
public class teoriaifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in);
System.out.println("ingrese dos numeros");
        int num1;
        num1 = leer.nextInt();
        int num2;
        num2 = leer.nextInt();

        
        if (num1 > 25 && num2 > 25)
        {
            System.out.println("los dos numeros son mayor a 25");
            }
        else if (num1 > 25 && num2 < 25){
    System.out.println("El primer numero es mayor a 25");
                        }
        else if (num1 < 25 && num2 > 25){
    System.out.println("El segundo numero es mayor a 25");
                        }
        else 
        {System.out.println("El segundo numero es mayor a 25");
                        }

    }
    
}
