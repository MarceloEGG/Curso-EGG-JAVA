/*
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
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
public final class Hotel5Estrellas extends Hotel4Estrellas {

    private int cantSalones;
    private int cantSuits;
    private int cantLimo;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantSalones, int cantSuits, int cantLimo, String gimnasio, String nombRest, int capacidadRest, int cantHabitaciones, int cantCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombRest, capacidadRest, cantHabitaciones, cantCamas, cantPisos,  nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuits = cantSuits;
        this.cantLimo = cantLimo;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuits() {
        return cantSuits;
    }

    public void setCantSuits(int cantSuits) {
        this.cantSuits = cantSuits;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
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

        this.precio += 15d * this.cantLimo;

    }

}
