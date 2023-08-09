/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author MAR
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String nombre, String alimento, int edad, String raza
        Animal Perro1 = new Perro("Fox", "carniboro", 3, "Ovejero");
        Animal Gato1 = new Gato("Michi", "carnivoro", 1, "Siames");
        Animal Caballo = new Caballo("Tornado", "Vegetariano", 4, "Arabe");

        Perro1.alimento();
        Gato1.alimento();
        Caballo.alimento();
    }

}
