/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;
import java.util.Scanner;
/**
 *
 * @author MAR
 */
public class ejemplowhile {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
   
    int nota=0;
            
    while (nota <=0 ||  nota >10 ){
         
        System.out.println("Introduzaca una nota entre el 0 y el 10 -> ");
        nota=leer.nextInt();
        if (nota < 0 || nota >10){
          System.out.println("Nota no valida intruzca la nota nuevamente ");
           }     else {
                  System.out.println("Nota Valida continue con el programa  ");
                      
        }
    }

    
        }
    }
  



