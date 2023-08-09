/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejrcicio4extraguia12;

import Servicios.ServicioU;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class Ejrcicio4extraGuia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        ArrayList< Personas> persona = new ArrayList<>();
//        persona.add(new Estudiantes("Mate", "Juan", "Perez", 8, "soltero"));
//        persona.add(new Estudiantes("Lengua", "Pedro", "Perez", 8, "casado"));
//        persona.add(new Profesor("Mate", 1978, 35, "Seba", "Pade", 85, "Casado"));
//        persona.add(new Profesor("Lengua", 1978, 35, "Seba", "Pade", 85, "Soltero"));
//        persona.add(new PersonalServicio("Bibloteca", 2000, 58, "Julio", "Roca", 95, "casado"));
//        persona.add(new PersonalServicio("Pasillo", 2000, 58, "Julio", "Roca", 95, "soltero"));

        final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioU u1 = new ServicioU();
  
        int f = 0;
     u1.cargarListas();
      
        do {
            System.out.println("Menu Visulizacion\n Que desea hacer?");
            
            System.out.println(
                    "1.mostrarEstudiantes\n"
                    + "2.mostrarPersonal\n"
                    + "3.mostrarProfe\n"
                    + "4.Menu de acciones\n"
                    + "0.Salir");
            f=leer.nextInt();
        
        
        switch (f) {

            case 1:
                u1.mostrarEstudiantes();
                break;
            case 2:
                u1.mostrarPersonal();
                break;
            case 3:
                u1.mostrarProfe();
                break;
            case 4:
                u1.menu();
                break;
        }
        } while (f != 0);
    }
}
