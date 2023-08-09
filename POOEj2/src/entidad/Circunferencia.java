/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author MAR
 */
import java.util.Scanner;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, 
 * se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 * 
 * @author Abel
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    private double radio; 
   
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    

    public double getRadio() {
        return radio;    
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
  
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio: ");
        setRadio(leer.nextDouble());
          
    }
   public void area(){
    Double Area;
    Area =( 3.1416 * Math.pow(getRadio(),2));
    System.out.println("El area del radio es: " + Area);
   }
     public void perimetro(){
    Double perimetro;
    perimetro =( 3.1416 * getRadio() * 2);
    System.out.println("El perímetro del radio es: " + perimetro);
   }

    public Circunferencia() {
    }
            
    
}