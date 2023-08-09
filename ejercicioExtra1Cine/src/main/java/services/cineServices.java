/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Butaca;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class cineServices {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Butaca[][] asientos = new Butaca[8][6];
    String[] fila = {"8", "7", "6", "5", "4", "3", "2", "1"};
    String[] columna = {"A", "B", "C", "D", "E", "F"};
/* crearSala llena la sala aleatoriamente*/
    public Sala crearSala() {
        Sala sala = new Sala();

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                Random random = new Random();
                int num = random.nextInt(2);
                if (num == 0) {
                    
                    asientos[i][j] = new Butaca(fila[i],columna[j], " ");
                } else {
                  
                    asientos[i][j] = new Butaca(fila[i],columna[j], "X");
                }
            }
            
        }
       
        sala.setPelicula(crearPelicula());
        return sala;
    }
public void mostrarSala(Sala sala){
    for (Butaca[] asiento : asientos) {
        for (Butaca butaca : asiento) {
            System.out.print(butaca);
        }
        System.out.println("");
    }
       
}
public Pelicula crearPelicula(){
    Pelicula xxx = new Pelicula();
    System.out.println("Ingrese nombre de pelicual");
    xxx.setTitulo(leer.next());
    System.out.println("Ingrese duracion");
    xxx.setDuracion(leer.nextDouble());
    System.out.println("Nombre del director");
    xxx.setDirector(leer.next());
    System.out.println("Limite de edad");
    xxx.setEdadMin(leer.nextInt());
    
    return xxx;
   
}
public Cine crearCine(Sala sala){
    ArrayList <Sala> sal = new ArrayList();
    Cine Cine1 = new Cine();
    sal.add(sala);
    Cine1.setSala(sal);
    System.out.println("Asignar valor de entrada");
    Cine1.setPrecioEntrada(leer.nextInt());
    return Cine1;
}

public void venderButaca(Cine cine, Sala sala, Espectador espect){
    boolean mayorEdad= espect.getEdad()>= sala.getPelicula().getEdadMin();
    if (!mayorEdad){
        System.out.println("Volve en unos años no cumplis con la edad");
    }
    boolean dinero=espect.getDinero()>= cine.getPrecioEntrada();
    if (!dinero) {
        System.out.println("No aceptamos pobres");
    }
    
    if (dinero && mayorEdad) {
        boolean ubicado=false;
        do {
            System.out.println("Elija ubicacion fila/columna");
            mostrarSala(sala);
            String fila=leer.next();
            String columna=leer.next();
            int filas = Math.abs(Integer.parseInt(fila) - 8);
            int columnas=Integer.parseInt(columna) - 1;
    if (asientos[filas][columnas].getOcupado().equals("X")){
        System.out.println("El asiento esta ocupado");
    }else{
        System.out.println("se asigno el asiento");
        asientos[filas][columnas].setOcupado("X");
        ubicado=true;
    }
                
            
        } while (!ubicado);
        mostrarSala(sala);
    }
}


}