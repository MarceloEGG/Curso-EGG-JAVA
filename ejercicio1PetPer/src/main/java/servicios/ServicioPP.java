package servicios;


import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class ServicioPP {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPersona(ArrayList<Persona> lista){
       boolean bandera= true;
     
        do {
            Persona p1 = new Persona();
        
            System.out.println("Ingrese nombre de persona");
           p1.setNombre(leer.next());
            System.out.println("Ingrese apellido");
            p1.setApellido(leer.next());
            System.out.println("Ingrese edad");
            p1.setEdad(leer.nextInt());
            System.out.println("Ingrese DNI");
            p1.setDni(leer.nextLong());
            lista.add(p1);
            System.out.println("desea ingresar otra persona (S/N)");
            bandera = leer.next().equalsIgnoreCase("s");
        } while (bandera);
        
    
}
       public void crearPerro(ArrayList<Perro> lista){
       boolean bandera= true;
       
        do {
            Perro p1 = new Perro();
        
            System.out.println("Ingrese nombre de perro");
           p1.setNombre(leer.next());
            System.out.println("Ingrese raza");
            p1.setRaza(leer.next());
            System.out.println("Ingrese edad");
            p1.setEdad(leer.nextInt());
            System.out.println("Ingrese Tamaño");
            p1.setTamanio(leer.next());
            lista.add(p1);
            System.out.println("desea ingresar otro perro (S/N)");
            bandera = leer.next().equalsIgnoreCase("s");
        } while (bandera);
        
    
}
       
}