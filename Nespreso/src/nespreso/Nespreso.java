/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespreso;

import Entidades.cafetera;
import Servicios.cafeteraServices;

/**
 *
 * @author MAR
 */
import java.util.Scanner;

public class Nespreso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cafeteraServices c1 = new cafeteraServices();
        cafetera ca = c1.crearCafetera();
        int op;
        System.out.println(ca.toString());

       
        
       System.out.println("Bienvenido al servicio NESPRESO " + "\n" + "Elija la opcion deseada" + "\n" + "1 Llenar cafetera" + "\n" + "2 Servir Taza de cafe" + "\n" + "3 Vaciar cafetera" + "\n" + "4 Recargar cafe" + "\n" + " 5 salir");
        op = leer.nextInt();

            switch (op) {
                case 1:
                    c1.cargarCafetera(ca);
                    System.out.println(ca.toString());
                    break;
                case 2:
                    c1.servirTaza(ca);
                    System.out.println(ca.toString());
                    break;
                case 3:
                    c1.cargarCafetera(ca);
                    System.out.println(ca.toString());
                    break;
                case 4:
                    c1.vaciarCafetera(ca);
                    System.out.println(ca.toString());
                    break;
                default:
                    throw new AssertionError();
            }


          
      
   
    
    }
}
