/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.cafetera;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class cafeteraServices {

    private Scanner leer = new Scanner(System.in);
//crear cafetera
    public  cafetera crearCafetera() {
       
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        int max=leer.nextInt() ;
        System.out.println("Ingrese cantidad actual");
        int actual=leer.nextInt() ;

         cafetera c1 = new cafetera(max,actual);
        
return  c1;
    }
    // llenar cafetera
    public void llenarCafetera(cafetera c1){
       
        c1.setCantidadActual(c1.getCapacidadMaxima());
    }
/* servir taza
Método servirTaza(int): 
se pide el tamaño de una taza vacía, 
el método recibe el tamaño de la taza y 
simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede. El método le informará al usuario si se llenó 
o no la taza, y de no haberse llenado en cuanto quedó la taza.*/
public void servirTaza(cafetera c1){
  
    int capacidad= c1.getCantidadActual();
    System.out.println("ingrese capacidad de la taza de cafe");
    int taza=leer.nextInt();
    if (taza<=capacidad){
        System.out.println("Taza sevida disfrute su cafe");
        c1.setCantidadActual(capacidad-taza);
    }else{
        System.out.println("la capacidad de la cafetera no es suficiente disculpe su taza selleno solo " +capacidad);
        c1.setCantidadActual(0);
        System.out.println("Solicite la recarga de la cafetera");
    } 
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
}
   /*Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.*/
public void cargarCafetera(cafetera c1){
   
    System.out.println("ingrese la cantidad de cafe que desea recargar");
   int recarga=leer.nextInt();
    if ((c1.getCantidadActual()+recarga)<c1.getCapacidadMaxima()){
        c1.setCantidadActual(c1.getCantidadActual()+recarga);
        System.out.println("se a recargado la cafetera");
    }else{
        System.out.println("usted supero la capacidad maxima de la cafetera");
        c1.setCantidadActual(c1.getCapacidadMaxima());
        int sobra =c1.getCantidadActual()+recarga - c1.getCapacidadMaxima();
        System.out.println("Sobran" +sobra ); 
    }
}
   public void vaciarCafetera(cafetera c1){
     
       c1.setCantidadActual(0);
   }
   
    
}
    




