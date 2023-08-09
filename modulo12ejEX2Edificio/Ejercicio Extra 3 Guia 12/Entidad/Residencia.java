/*
Para las residencias se indica la cantidad de habitaciones, si se hacen o no 
descuentos a los gremios y si posee o no campo deportivo. Realizar un programa 
en el que se representen todas las relaciones descriptas. 
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
public final class Residencia extends ExtraHotel {
    
    private boolean descuento;
    private boolean campDep;
    private int cantHabit;

    public Residencia() {
    }

    public Residencia(boolean descuento, boolean campDep, int cantHabit, boolean esPrivado, double metros, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metros, nombre, direccion, localidad, gerente);
        this.descuento = descuento;
        this.campDep = campDep;
        this.cantHabit = cantHabit;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampDep() {
        return campDep;
    }

    public void setCampDep(boolean campDep) {
        this.campDep = campDep;
    }

    public int getCantHabit() {
        return cantHabit;
    }

    public void setCantHabit(int cantHabit) {
        this.cantHabit = cantHabit;
    }
    
    
    
}
