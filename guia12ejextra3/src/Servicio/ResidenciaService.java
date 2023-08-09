/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 

 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4Estrellas;
import Entidad.Hotel5Estrellas;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mauro
 */
public class ResidenciaService {

    List<Alojamiento> aloj = new ArrayList();

//    List <Hotel> h1 = new ArrayList();
    public void llenarLista() {

        aloj.add(new Hotel4Estrellas("A", "Rest1", 40, 60, 120, 8, "hotel1", "direccion1", "localidad1", "gerente1"));
        aloj.add(new Hotel4Estrellas("B", "Rest2", 20, 40, 80, 4, "hotel2", "direccion2", "localidad2", "gerente2"));
        aloj.add(new Hotel5Estrellas(3, 20, 10, "A", "Rest3", 60, 100, 200, 4, "hotel3", "direccion3", "localidad3", "gerente3"));
        aloj.add(new Hotel5Estrellas(3, 20, 5, "B", "Rest4", 60, 100, 200, 4, "hotel3", "direccion3", "localidad3", "gerente3"));
        aloj.add(new Camping(30, 15, true, true, 800d, "Camping1", "Ruta1", "Berazategui", "Mauro"));
        aloj.add(new Camping(30, 15, false, true, 800d, "Camping2", "Ruta1", "Berazategui", "Mauro"));
        aloj.add(new Residencia(true, true, 20, true, 750d, "Residencia1", "Ruta2", "Quilmes", "Fede"));
        aloj.add(new Residencia(false, false, 10, true, 750d, "Residencia2", "Ruta2", "Quilmes", "Fede"));

    }

    public void mostrarLista() {

        for (Alojamiento aux : aloj) {

            System.out.println(aux.toString());

        }

    }

    public void mostrarHoteles() {

        List<Hotel> h1 = new ArrayList();

        for (Alojamiento aux : aloj) {

            if (aux instanceof Hotel) {

                h1.add((Hotel) aux); // Castea alojamiento y lo convierte en Hotel

            }

        }

        h1.sort(Comparator.comparing(Hotel::getPrecio).reversed()); // Ordenar de mayor a menor por precio

        for (Hotel hotel : h1) {

            System.out.println(hotel.toString());

        }
    }

    public void mostrarcamping() {
        for (Alojamiento aux : aloj) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isRest()) {
                    System.out.println(aux.toString());
                }
            }
        }
    

    }
    public void mostrarresidencias(){
        for (Alojamiento aux : aloj) {
            if (aux instanceof Residencia){
                if (((Residencia) aux).isDescuento()){
                    System.out.println(aux.toString());
            }
            }
        }
    }
}
