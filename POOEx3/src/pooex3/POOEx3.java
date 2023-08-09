/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex3;

import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class POOEx3 {

  public static void main(String[] args) {
        Juego Jgo = new Juego();

        Scanner leer = new Scanner(System.in);

        String respuesta;

        do {

            System.out.println("¿desea seguir jugando? s/n:");
            respuesta = leer.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                
                Jgo.MensajeFinal();
                
                break;
            }

            Jgo.Incio();

        } while (respuesta.equalsIgnoreCase("s"));

    }}
