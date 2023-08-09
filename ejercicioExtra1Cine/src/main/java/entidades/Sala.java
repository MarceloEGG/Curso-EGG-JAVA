/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author MAR
 */
public class Sala {
    private Butaca[][] butaca;
    private Pelicula pelicula;

    public Sala() {
    }

    public Sala(Butaca[][] butaca, Pelicula pelicula) {
        this.butaca = butaca;
        this.pelicula = pelicula;
    }

    public Butaca[][] getButaca() {
        return butaca;
    }

    public void setButaca(Butaca[][] butaca) {
        this.butaca = butaca;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
}
