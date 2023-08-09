/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
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
public class Hotel4Estrellas extends Hotel {

    protected String gimnasio;
    protected String nombRest;
    protected int capacidadRest;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnasio, String nombRest, int capacidadRest, int cantHabitaciones, int cantCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombRest = nombRest;
        this.capacidadRest = capacidadRest;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombRest() {
        return nombRest;
    }

    public void setNombRest(String nombRest) {
        this.nombRest = nombRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }
//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
//agregado por gimnasio) + (valor agregado por limosinas). 
//Donde: 
//Valor agregado por el restaurante: 
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas. 
//• $50 si es mayor de 50. 
//Valor agregado por el gimnasio: 
//• $50 si el tipo del gimnasio es A. 
//• $30 si el tipo del gimnasio es B. 
//Valor agregado por las limosinas: 
//• $15 por la cantidad de limosinas del hotel.

    @Override
    public void precio() {
        super.precio();

        this.precio+=this.capacidadRest>50?50d:this.capacidadRest>30?30d:10d;
        
//        if (this.capacidadRest < 30) {
//
//            this.precio += 10d;
//        } else if (this.capacidadRest <= 50) {
//
//            this.precio += 30d;
//        } else {
//
//            this.precio += 50d;
//        }

        
//        if(this.gimnasio.equalsIgnoreCase("a")){
//            
//            this.precio+=50d;
//            
//        } else{
//            this.precio+=30d;
//        }
        
       this.precio+= (this.gimnasio.equalsIgnoreCase("a"))? 50d : 30d;
        
        
       
//        switch (this.gimnasio) {
//
//            case "A":
//                this.precio += 50;
//                break;
//            case "B":
//                this.precio += 30;
//                break;
//
//        }

    }

}
