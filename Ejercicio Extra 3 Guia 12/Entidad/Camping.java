/*
Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
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
public final class Camping extends ExtraHotel {
    
    private int cantMaxCarp;
    private int cantBaños;
    private boolean rest;

    public Camping() {
    }

    public Camping(int cantMaxCarp, int cantBaños, boolean rest, boolean esPrivado, double metros, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metros, nombre, direccion, localidad, gerente);
        this.cantMaxCarp = cantMaxCarp;
        this.cantBaños = cantBaños;
        this.rest = rest;
    }

    public int getCantMaxCarp() {
        return cantMaxCarp;
    }

    public void setCantMaxCarp(int cantMaxCarp) {
        this.cantMaxCarp = cantMaxCarp;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }
    
    
    
}
