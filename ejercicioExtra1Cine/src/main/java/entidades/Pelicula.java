/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
Luego, de las películas nos interesa saber
el título, duración, edad mínima y director.
 */
public class Pelicula {
    private String titulo;
    private double duracion;
    private int edadMin;
    private String Director;

    public Pelicula() {
    }

   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo +"\n" + "Duracion: " + duracion +"\n" + " Director:" + Director +"\n"+ "Para mayores de :" + edadMin;
    }
    
}
