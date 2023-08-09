/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Relaciones.Colecciones;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioPP;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 */
public class Ejercicio1PetPer {

    public static void main(String[] args) {
        ArrayList<Persona> p1 = new ArrayList<>();
        ArrayList<Perro> p2 = new ArrayList<>();
        ServicioPP S1 = new ServicioPP();
        Scanner leer = new Scanner(System.in);
        //S1.crearPersona(p1);
        S1.crearPerro(p2);
        Persona juan = new Persona();
        juan.setNombre("juan");
        juan.setApellido("popo");
         Persona pedro = new Persona();
        juan.setNombre("pedro");
        juan.setApellido("popo");
p1.add(pedro);
p1.add(juan);
        
        for (Persona p3 : p1) {
            System.out.println(p3.getNombre());

            System.out.println("Elija un  perro por nombre para esa persona ");
            for (Perro perro : p2) {
                System.out.println(perro.toString());

            }
            String perron = leer.next();
            int control = 0;
            for (int i = 0; i < p2.size(); i++) {
                if (perron.equalsIgnoreCase(p2.get(i).getNombre())) {
                    p3.setPerro(p2.get(i));
                    control++;
                    p2.remove(i);
                }

            }
            if (control == 0) {
                System.out.println("No hay perro");
            }

        }
        for (Persona persona : p1) {
            System.out.println(persona.toString());
            
        }
        System.out.println("-------------------------------");
        for (Perro perro : p2) {
            System.out.println(perro.toString());
            
        }
    }

}
