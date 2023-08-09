/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1c9;

import entidad.ahorcado;
import servicios.ahorcadoServices;

/**
 *
 * @author MAR
 */
public class ahorcadoJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ahorcadoServices services = new ahorcadoServices();
       
       ahorcado juego1 = services.crearJuego();
       
        do {
           services.juego(juego1);
        } while (juego1.getJugadas()!=0 && juego1.getPalabra().length!=juego1.getLetras() );
        
        if (juego1.getPalabra().length==juego1.getLetras()){
        System.out.println("El juego termino usted ah ganado");
        } else{
               System.out.println("Game over"); 
                }
       
    }
    
}
