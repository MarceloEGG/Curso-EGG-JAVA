/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
       r1.area();
       r1.perimetro();
       r1.dibujo();
       
        
                
    }
    /*
    public static void crearRectangulo(){
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base y altura del rectangulo respectivamente");
       new Rectangulo().setBase(leer.nextDouble());
      new Rectangulo().setAltura(leer.nextDouble());
        
    }*/
}
