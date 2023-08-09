/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class tiendaServices {
    Scanner lr = new Scanner(System.in);
//     HashMap<String,Double> producto = new HashMap();
//        tiendaServices p1 = new tiendaServices();
//        p1.crearProducto(producto);
//        p1.modificarProducto(producto);
//        p1.eliminarProducto(producto);
//        p1.mostrarProducto(producto);
    public void crearProducto(HashMap<String,Double>producto){
        System.out.println("Ingrese nombre de producto");
        String nombre = lr.next();
        System.out.println("Ingrese valor");
        double precio = lr.nextDouble();
        
        producto.put(nombre, precio);
    }
    public void modificarProducto(HashMap<String,Double>producto){
        System.out.println("Que producto desea modificar");
        String pmod=lr.next();
        System.out.println("Ingrese el nuevo valor");
        double nvalor=lr.nextDouble();
        
        if(producto.containsKey(pmod)){
            producto.put(pmod, nvalor);
            System.out.println("El valor del producto se modifico correctamente");
        }else{
            System.out.println("El producto no se encontro en la lista");
        }
    }
    public void eliminarProducto (HashMap<String,Double>producto){
        System.out.println("Que producto desea eliminar");
        String pmod=lr.next();
        
        if(producto.containsKey(pmod)){
            producto.remove(pmod);
            System.out.println("El producto se elimino correctamente");
        }else{
            System.out.println("El producto no se encontro en la lista");
        }
    }
    public void mostrarProducto (HashMap<String,Double>producto){
        for (Map.Entry<String, Double> entry : producto.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " :" +value);
        } 
            
        
    }
    
}
