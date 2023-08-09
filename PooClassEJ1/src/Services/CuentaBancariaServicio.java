/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class CuentaBancariaServicio {

    private Scanner Leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println(" Ingrese su numero de cuenta");

        int numeroCuenta = Leer.nextInt();
        System.out.println(" Ingrese su numero de DNI");
        long dniCliente = Leer.nextLong();
        System.out.println(" Ingrese su Saldo");
        double saldoActual = Leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

    }

    public void ingresar(CuentaBancaria C) {
        double saldo = C.getSaldoActual();
        double ingreso;
        System.out.println("Ingrese deposito");
        ingreso = Leer.nextDouble();
        C.setSaldoActual(saldo + ingreso);
        System.out.println("El saldo es de " + C.getSaldoActual());
    }
    
public void  retirar(CuentaBancaria C){
    System.out.println("indique la cantidad a retirar");
    double retiro= Leer.nextDouble();
    
    if (C.getSaldoActual() < retiro){
        System.out.println("Usted puede retirar "+C.getSaldoActual());
        C.setSaldoActual(0);
    }else{
                System.out.println("Retiro completo");
                C.setSaldoActual(C.getSaldoActual()-retiro);
                }
    }
public void extraccionRapida(CuentaBancaria C){
    System.out.println("(Usted puede retirar hasta un 20% de su saldo) Ingrese el monto a retirar ");
       double retiro= Leer.nextDouble();
    
    if (retiro > C.getSaldoActual()*0.2){
        System.out.println("Usted no puede retirar ese valor con extraccion rapida");
    }else{
                System.out.println("Retiro completo");
                C.setSaldoActual(C.getSaldoActual()-retiro);
                }
}
public void consultarSaldo(CuentaBancaria C){
    System.out.println("Su saldo actual es "+ C.getSaldoActual());
}

}

