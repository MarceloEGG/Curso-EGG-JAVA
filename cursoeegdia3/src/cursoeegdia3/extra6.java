/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoeegdia3;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas 
 * que se encuentran por debajo de 1.60 mts. y el promedio de estaturas 
 * en general.

 * @author MAR
 */
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
System.out.println("Ingrese numero de personas para estadistica");
int cantidad = leer.nextInt();
  double suma1=0;
  double suma2=0;
  int cont1=0;
  int cont2=0;
        System.out.println("Ingrese la altura de los sujetos");
  for (int i=0; i < cantidad; i++){
     double num= leer.nextDouble();
     cont1++;
     suma1=suma1+num ;
     if (num<1.60){
 cont2++;
 suma2=suma2+num ;  
  }
    }
        System.out.println("El promedio general de estaturas es "+ suma1/cont1);
        System.out.println("El promedio de altura de personas por debajo de 1.60m es "+ suma2/cont2);
    }}
