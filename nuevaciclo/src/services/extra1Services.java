/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidad.cantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class extra1Services {
     Scanner lr = new Scanner(System.in).useDelimiter("\n");;
     
    public void crearCantante(ArrayList<cantanteFamoso> cantantes ){
        cantanteFamoso c1 =new cantanteFamoso();
       boolean continuar = false;
               
        do {
            System.out.println("Ingrese Nombre de cantante");
            c1.setNombre(lr.nextLine()) ;
            System.out.println("Ingrese el disco mas vendido");
          c1.setDiscoMasVendido(lr.nextLine());
          cantantes.add(c1);
            System.out.println("Desea ingresar otro cantante? (S/N)");
            continuar = lr.nextLine().equalsIgnoreCase("s");
        } while (continuar);
        
        
    }
    public void eliminarCantante(ArrayList<cantanteFamoso> cantantes){
        System.out.println("ingrese cantante que desea eliminar");
        String cantEl = lr.nextLine();
        
        Iterator<cantanteFamoso> It = cantantes.iterator();
       boolean bandera = false;
        while (It.hasNext()) {
           String aux = It.next().getNombre();
           if (cantEl.equalsIgnoreCase(aux))
               It.remove();
           bandera=true;
        
        }
        if(bandera){
        System.out.println("El cantante no se encuentra en la lista");
    }
    }
    public void mostrarlista (ArrayList<cantanteFamoso> cantantes){
        for (cantanteFamoso cantante : cantantes) {
            System.out.println(cantante.toString());
            
        }
    }
}
