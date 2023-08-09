/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author MAR
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("--------Menu Alojamientos--------");
        public void llenarLista();
//        Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
////• todos las residencias que tienen descuento.
System.out.println("Que desea visulizar");
        System.out.println(
                "1.todos los alojamientosn.\n"+
                "2.Todos los hoteles de más caro a más barato.\n"+
                "3.todos los campings con restaurante.\n"+
       "4.todos las residencias que tienen descuento.");
        
            int aux= leer.nextInt();
    switch (aux){
        case 1: mostrarLista();
        break;
        case 2:  mostrarHoteles();
        break;
        case 3: mostrarcamping();
        break;
        case 4: mostrarresidencias();
        break;
        default: System.out.println("no es una opcion valida");
    }
    }
    }
    
}
