/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemain;

import entidad.pelicula;
import java.util.ArrayList;
import services.peliculaServices;
/**
 *
 * @author MAR
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<pelicula> peliculas = new ArrayList<>();
  peliculaServices p1 = new peliculaServices();
       p1.crearPelicula(peliculas);
       p1.mostrarPeliculas(peliculas);
      p1.peliculasMasUnaHora(peliculas);
       p1.ordenarPeliculasMayor(peliculas);
      p1.ordenarPeliculasAlfabeticamente(peliculas);
      p1.ordenarPeliculasPorDirector(peliculas);
    }
    
}
