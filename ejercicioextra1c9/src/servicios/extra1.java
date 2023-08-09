/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class extra1 {

    Scanner Leer = new Scanner(System.in);

    public String[] crearVector() {
        String[] anio = new String[12];
        anio[0] = "enero";
        anio[1] = "febrero";
        anio[2] = "marzo";
        anio[3] = "abril";
        anio[4] = "mayo";
        anio[5] = "junio";  
        anio[6] = "julio";
        anio[7] = "agosto";
        anio[8] = "septiembre";
        anio[9] = "octubre";
        anio[10] = "noviembre";
        anio[11] = "diciembre";
       return anio;
    }
    public void adivine(String[]anio) {
        boolean acierto = false;
System.out.println("Adivine el mes del año ingreselo en minusculas");
        do {
            
            String adivine1 = Leer.next();
            String mesSecreto = anio[1];

            acierto = adivine1.equals(mesSecreto);
            if (!acierto){
                System.out.println("intentelo de nuevo");
            }
        } while (!acierto);
        System.out.println("Acertaste");
    }

}

