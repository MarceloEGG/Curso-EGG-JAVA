/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
números y los ingresa en los atributos del objeto. Después, a través de otro 
método calcular y devolver la distancia que existe entre los dos puntos que 
existen en la clase Puntos. Para conocer como calcular la distancia entre 
dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class Punto {
    public float x1,x2,y1,y2;
Scanner leer = new Scanner(System.in);
    
public Punto() {
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
   public void crearPuntos(){
       System.out.println("ingrese los puntos de ubicacion X1, Y1 X2 , Y2");
       this.x1=leer.nextFloat();
       this.y1=leer.nextFloat();
       this.x2=leer.nextFloat();
       this.x2=leer.nextFloat();
   } 
   public void distancia(){
       double dista= Math.sqrt((Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2))));
       System.out.println("La distancia entre puntos es: "+dista);
   }
}
