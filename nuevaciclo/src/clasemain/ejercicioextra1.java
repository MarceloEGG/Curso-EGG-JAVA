/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package clasemain;

import entidad.cantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;
import services.extra1Services;

/**
 *
 * @author MAR
 */
public class ejercicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        ArrayList<cantanteFamoso> cantantes = new ArrayList<>();
        cantanteFamoso d1 = new cantanteFamoso();
        extra1Services p1 = new extra1Services();
        cantantes.add(new cantanteFamoso("Sergio", "Sarasa"));
        cantantes.add(new cantanteFamoso("Soraya", "lala"));
        cantantes.add(new cantanteFamoso("Shakira", "Cornuda"));
        cantantes.add(new cantanteFamoso("Soledad", "El poncho volador"));
        cantantes.add(new cantanteFamoso("Lali", "me apoyaron en el mundial"));

        int menu = 0;
        do {

            System.out.println("-----------Menu--------");
            System.out.println("1- Visulizar la lista ");
            System.out.println("2- Agregar Cantante");
            System.out.println("3- Eliminar cantante");
            System.out.println("4- Salir");
            menu = lr.nextInt();

            switch (menu) {
                case 1:
                    p1.mostrarlista(cantantes);
                    break;
                case 2:
                    p1.crearCantante(cantantes);
                    break;
                case 3:
                    p1.eliminarCantante(cantantes);
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (menu != 4);

    }

}
