/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package clasemain;

import java.util.HashMap;
import java.util.Scanner;
import services.tiendaServices;

/**
 *
 * @author MAR
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Double> producto = new HashMap();
        tiendaServices p1 = new tiendaServices();
        Scanner leer = new Scanner(System.in);
        int menu=0;
            
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    p1.crearProducto(producto);
                    break;
                case 2:
                   p1.modificarProducto(producto);
                    break;
                case 3:
                    p1.eliminarProducto(producto);
                    break;
                case 4:
                   p1.mostrarProducto(producto);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (menu!= 5);
        
        
        
        
    }
    
}
