/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemain;

import java.util.HashSet;
import services.paisesServices;


/**
 *
 * @author MAR
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     HashSet<String> pais= new HashSet();
       paisesServices p1 = new  paisesServices();
        
   p1.crearConjunto(pais);
 p1.mostrarPaises(pais);
        System.out.println("-----------------");
    p1.ordenarPaises(pais);
    p1.eliminarPais(pais);
    p1.mostrarPaises(pais);
    }
   
}
