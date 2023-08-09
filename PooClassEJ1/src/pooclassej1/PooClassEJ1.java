/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclassej1;

import Entidad.CuentaBancaria;
import Services.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class PooClassEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
        CuentaBancariaServicio cuenta1 = new CuentaBancariaServicio();
        CuentaBancaria c1 = cuenta1.crearCuenta();
        String respuesta = "s";
        do {
            System.out.println("MENU" + "\n" + "1. INGRESAR DINERO" + "\n" + "2. RETIRAR DINERO" + "\n" + "3. EXTRACCION RAPIDA" + "\n" + "4. CONSULTAR SALDO" + "\n" + "5. CONSULTAR DATOS" + "\n" + "6. SALIR");
            respuesta = Leer.next();
            switch (respuesta) {
                case "1":
                    cuenta1.ingresar(c1);
                    respuesta = "s";
                    break;
                case "2":
                    cuenta1.retirar(c1);
                    respuesta = "s";
                    break;
                case "3":
                    cuenta1.extraccionRapida(c1);
                    respuesta = "s";
                    break;
                case "4":
                    cuenta1.consultarSaldo(c1);
                    respuesta = "s";
                    break;
                case "5":
                    System.out.println(c1.toString());
                    respuesta = "s";
                    break;
                case "6":
                    respuesta = "n";
                    break;
            }
        } while (respuesta.equals("s"));
    }

}
