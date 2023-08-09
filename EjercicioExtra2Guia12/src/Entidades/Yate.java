/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author MAR
 */
public final class Yate extends Amotor{
  private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int potencia) {
        super(potencia);
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potencia, int matricula, int eslora, int anio, int modulo) {
        super(potencia, matricula, eslora, anio, modulo);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }



    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Ingrese numero de camarotes");
        this.camarotes=leer.nextInt();
       
    }
  
  
}
