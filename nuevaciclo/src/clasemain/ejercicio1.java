/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista ydespués se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * -------------------- Continuando el ejercicio anterior, después de mostrar
 * los perros, al usuario se le pedirá un perro y se recorrerá la lista con un
 * Iterator, se buscará el perro en la lista. Si el perro está en la lista, se
 * eliminará el perro que ingresó el usuario y se mostrará la lista ordenada. Si
 * el perro no se encuentra en la lista, se le informará al usuario y se
 * mostrará la lista ordenada.
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> razaPerro = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        String aux = "si";
        do {
            System.out.println("ingrese raza de perro ");
            razaPerro.add(leer.next());
            System.out.println("desea ingresar otro");
            aux = leer.next();
        } while (!aux.equals("no"));

        System.out.println(razaPerro.toString());

        System.out.println("ingrese raza a eliminar");
        String elimina = leer.next();
        Iterator<String> it = razaPerro.iterator();
               String aux2;
        while (it.hasNext()) {
aux2=it.next();
            if (aux2.equalsIgnoreCase(elimina)) {
                it.remove();
            }else
                        System.out.println("no se encontro en la lista");
                        }
        System.out.println(razaPerro.toString());
            }

        }

    


