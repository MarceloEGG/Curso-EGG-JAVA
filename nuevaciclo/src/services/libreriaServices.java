/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidad.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
El método se incrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que
se realice un préstamo del libro. No se podrán prestar libros de los que no queden
ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no
tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y
false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
public class libreriaServices {
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresarLibro(HashSet<Libro> Libreria){
        Libro c1 =new Libro();
       boolean continuar = false;
               
        do {
            System.out.println("Ingrese Nombre del libro");
            c1.setTitulo(lr.next());
            System.out.println("Ingrese el autor");
          c1.setAutor(lr.next());
            System.out.println("ingrese cantidad de ejemplares");
            c1.setEjemplares(lr.nextInt());
            Libreria.add(c1);
            System.out.println("Desea ingresar otro libro? (S/N)");
            continuar = lr.next().equalsIgnoreCase("s");
        } while (continuar);
        
    }
    public void prestamo(HashSet<Libro> Libreria){
        System.out.println("Que libro desea retirar");
        String  libro1 = lr.next();
        Iterator <Libro> it = Libreria.iterator();
        String aux= it.next().getTitulo();
        boolean x= false;
        while (it.hasNext()) {
           
            if (libro1.equalsIgnoreCase(aux)){
                if (it.next().getEjemplares()>0)
                it.next().setPrestados(it.next().getPrestados()+1);
                it.next().setEjemplares(it.next().getEjemplares()-1);
                System.out.println("Usted ah retirado un libro");
                x=true;
            }
                
            }
            if(x){
                System.out.println("El libro no se encuentra disponible");
        }
    }
    public void devolucion(HashSet<Libro> Libreria){
         System.out.println("Que libro desea devolver");
        String  libro1 = lr.next();
        Iterator <Libro> it = Libreria.iterator();
        String aux= it.next().getTitulo();
        boolean x= false;
        while (it.hasNext()) {
           
            if (libro1.equalsIgnoreCase(aux)){
                if (it.next().getEjemplares()>0)
                it.next().setPrestados(it.next().getPrestados()-1);
                it.next().setEjemplares(it.next().getEjemplares()+1);
                System.out.println("Usted ah devuelto un libro");
                x=true;
            }
                
            }
            if(x){
                System.out.println("El libro no corresponde a la libreria");
        }
    }
    public void mostrar(HashSet<Libro> Libreria){
        for (Libro libro : Libreria) {
            System.out.println(libro.toString());
        }
    }
    
    
    }
    

