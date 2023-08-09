/*
Los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
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
public class ExtraHotel extends Alojamiento {
    
   protected boolean esPrivado;
   protected double metros;

    public ExtraHotel() {
    }

    public ExtraHotel(boolean esPrivado, double metros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.metros = metros;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }
   
   
}
