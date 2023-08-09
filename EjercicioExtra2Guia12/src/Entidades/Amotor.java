/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author MAR
 */
public class Amotor extends Barco {

    protected int potencia;

    public Amotor() {
    }

    public Amotor(int potencia) {
        this.potencia = potencia;
    }

    public Amotor(int potencia, int matricula, int eslora, int anio, int modulo) {
        super(matricula, eslora, anio, modulo);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }



    @Override
    public Barco crearBarco() {
        super.crearBarco();
        System.out.println("Ingrese la potencia del motor");
        this.potencia = leer.nextInt();
        return new Amotor();
    }

}
