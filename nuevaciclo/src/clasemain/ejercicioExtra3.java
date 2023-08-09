/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar el título del libro,
autor, número de ejemplares y número de ejemplares prestados. También se creará en
el main un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters

21
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
package clasemain;

import entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import services.libreriaServices;

/**
 *
 * @author MAR
 */
public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      HashSet<Libro> Libreria= new HashSet();
      Scanner lr = new Scanner(System.in);
      libreriaServices l1= new libreriaServices();
        System.out.println("Libreria los HDP");
        int menu=0;
        do {
            System.out.println("------menu-------");
        System.out.println("Agregar un libro - 1");
        System.out.println("ver lista de libros - 2");
        System.out.println("Retirar un libro - 3 ");
        System.out.println("Devolver un libro - 4");
            System.out.println("Desea salir - 5");
            menu= lr.nextInt();
            switch(menu){
                case 1: l1.ingresarLibro(Libreria);
                break;
                case 2: l1.mostrar(Libreria);
                break;
                case 3: l1.prestamo(Libreria);
                break;
                case 4: l1.devolucion(Libreria);
                break;
                case 5: System.out.println("Gracias por visitarnos");
            }
        } while (menu!=5);
        
        
       
        
        
    }
    
}
