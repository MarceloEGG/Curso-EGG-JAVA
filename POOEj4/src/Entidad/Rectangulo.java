/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para
crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y 
un método para calcular el perímetro del rectángulo. Por último, tendremos 
un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class Rectangulo {
    private double base,altura;

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public  void crearRectangulo(){
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base y altura del rectangulo respectivamente");
     this.base=(leer.nextDouble());
    this.altura=(leer.nextDouble());
    }
    public void area(){
        double area = this.altura*this.base;
        System.out.println("la superficie del rectangulo es: "+area);
    }
    public void perimetro(){
       double perimetro = (this.altura+this.base) * 2;
       System.out.println("el perimetro del rectangulo es: "+perimetro);
    }
    public void dibujo(){
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                if (i==0 || i==this.base-1 || j==0 || j==this.altura-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");}
                }
                System.out.println("");
            }
            
        }
    }

