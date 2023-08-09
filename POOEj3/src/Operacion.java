package pooej03;

import java.util.Scanner;

/**
     * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, 
     * se deben crear los siguientes métodos:
       a) Método constructor con todos los atributos pasados por parámetro.
       b) Método constructor sin los atributos pasados por parámetro.
       c) Métodos get y set.
       d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
       e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
       f)  Método restar(): calcular la resta de los números y devolver el resultado al main
       g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
       el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
       h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
        el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve 
         el resultado al main.
 */

public class Operacion {
    private Double n1, n2;
    Scanner leer = new Scanner(System.in);
    
    public Operacion() {
    }
    public Operacion(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public Double getN1() {
        return n1;
    }
    public Double getN2() {
        return n2;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el valor de los 2 números: ");
        setN1(leer.nextDouble());
        setN2(leer.nextDouble());
    }
    public void suma(){
        double suma;
        suma = getN1() + getN2();
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    public void resta(){
        double resta;
        resta = getN1() - getN2();
        System.out.println("La resta de los números ingresados es: " + resta);
    }
    public void mul(){
        double mul;
        
        if( getN1() == 0 || getN2() == 0){
            System.out.println("ERROR!!");
            System.out.println("Ingrese un valor correcto: ");
            crearOperacion();
               
      suma();
      resta();
      mul();
     
        } else{
             mul = getN1() * getN2();
        System.out.println("La multiplicación de los números ingresados es: " + mul);
        }
         
    }
    
    public void div(){
        double div;
        if( getN1() == 0 || getN2() == 0){
            System.out.println("ERROR!!");
            System.out.println("Ingrese un valor correcto!");
           crearOperacion();
      suma();
      resta();
    
      div();
            
        } else{
        div = getN1() / getN2();
        System.out.println("La división de los números ingresados es: " + div);
    }
  }      
}