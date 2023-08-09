/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las 
características de las distintas categorías son las siguientes: 
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier 
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro 
será. 
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) + (valor agregado por limosinas). 
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Mauro
 */
public class Hotel extends Alojamiento {
    
   protected int cantHabitaciones;
   protected int cantCamas;
   protected int cantPisos;
   protected double precio;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int cantCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
//    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
//agregado por gimnasio) + (valor agregado por limosinas). 
    
   public void precio (){
       
       this.precio = 50d + this.cantCamas; 
   }
    
}
