/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class paisesServices {

    Scanner leer = new Scanner(System.in);

    public void crearConjunto(HashSet<String> pais) {
        //HashSet<String> pais= new HashSet();
        boolean ingresar = true;
        System.out.println("ingrese paises");

        while (ingresar) {
            pais.add(leer.next());
            System.out.println(" Ingresar pais si(s) no (n)");
            ingresar = leer.next().equalsIgnoreCase("s");

        }
//       for (Object pai : pais) {
//          System.out.println(pai);
//      }

    }

    public void mostrarPaises(HashSet<String> pais) {

        for (Object pai : pais) {
            System.out.println(pai);

        }

    }

    public void ordenarPaises(HashSet<String> pais) {
        ArrayList<String> paisordenado = new ArrayList<>(pais);
        Collections.sort(paisordenado);
//paisordenado.sort(Comparator.naturalOrder());
        for (String chiquito : paisordenado) {
            System.out.println(chiquito);

        }

    }
    public void eliminarPais (HashSet <String> pais){
            System.out.println("Ingrese un pais a eliminar");
            String paiseliminar = leer.next();
            Iterator<String> it = pais.iterator();
            boolean eliminado = false;
            while (it.hasNext()){
                String aux2=it.next();
                if (aux2.equalsIgnoreCase(paiseliminar)){
                    it.remove();
                    eliminado=true;
                }    
            }
           if (eliminado){
               System.out.println("Se elimino el pais");
               
                       }else{
                       System.out.println("No se encontro el pais");
           }
              
            
        }

}
