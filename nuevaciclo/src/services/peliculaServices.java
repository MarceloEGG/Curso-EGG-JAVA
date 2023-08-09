/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package services;

import entidad.pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class peliculaServices {

    public void crearPelicula(ArrayList<pelicula> peliculas) {
        Scanner lr = new Scanner(System.in);
        boolean crear = true;

        while (crear) {

            pelicula pelis = new pelicula();
            System.out.println("Ingrese nombre de la pelicula");
            pelis.setTitulo(lr.next());
            System.out.println("Ingrese nombre de director");
            pelis.setDirector(lr.next());
            System.out.println("Ingrese duracion de la pelicula");
            pelis.setDuracion(lr.nextInt());

            peliculas.add(pelis);
            System.out.println("Desea ingresar una nueva pelicula Si (s) no (n)");
            crear = lr.next().equalsIgnoreCase("s");
        }
    }

    public void mostrarPeliculas(ArrayList<pelicula> peliculas) {

        for (pelicula pelicula1 : peliculas) {
            System.out.println(pelicula1);

        }
    }

    public void peliculasMasUnaHora(ArrayList<pelicula> peliculas) {
        for (pelicula pelicula1 : peliculas) {
            if (pelicula1.getDuracion() > 1) {
                System.out.println(pelicula1);
            }

        }
    }

    public void ordenarPeliculasMayor(ArrayList<pelicula> peliculas) {

        peliculas.sort(Comparator.comparing(pelicula::getDuracion).reversed());
        
        mostrarPeliculas(peliculas);
    }
    
     public void ordenarPeliculasMenor(ArrayList<pelicula> peliculas) {

        peliculas.sort(Comparator.comparing(pelicula::getDuracion));
        
        mostrarPeliculas(peliculas);
    }
     public void ordenarPeliculasAlfabeticamente (ArrayList<pelicula> peliculas){
         peliculas.sort(Comparator.comparing(pelicula::getTitulo));
         mostrarPeliculas(peliculas);
     }
     public void ordenarPeliculasPorDirector (ArrayList<pelicula> peliculas){
         peliculas.sort(Comparator.comparing(pelicula::getDirector));
         mostrarPeliculas(peliculas);
     }
}


        
        
       
        
    