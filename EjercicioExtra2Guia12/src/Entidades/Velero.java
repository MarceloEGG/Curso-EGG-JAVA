/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author MAR
 */
public final class Velero extends Barco {
   private int mastiles;

    public Velero() {
      
    }



    public Velero(int mastiles, int matricula, int eslora, int anio, int modulo) {
        super(matricula, eslora, anio, modulo);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

  
    @Override
    public String toString() {
        return super.toString()+
                "Velero\n" + "mastiles:" + mastiles +"\n"+ modulo ;
    }

@Override
public void modulo() {
    super.modulo();
         this.modulo   +=this.mastiles; 
}


    @Override
   public void crearBarco() {
        super.crearBarco();
      
        System.out.println("ingrese numero de mastiles");
        this.mastiles=leer.nextInt();
        modulo();
    }
   
}
