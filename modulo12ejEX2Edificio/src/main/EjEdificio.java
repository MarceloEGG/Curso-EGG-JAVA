package main;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 * alto y largo. La clase edificio tendrá como métodos: • Método
 * calcularSuperficie(): calcula la superficie del edificio. • Método
 * calcularVolumen(): calcula el volumen del edifico. Estos métodos serán
 * abstractos y los implementarán las siguientes clases: • Clase Polideportivo
 * con su nombre y tipo de instalación que puede ser Techado o Abierto, esta
 * clase implementará los dos métodos abstractos y los atributos del padre. •
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre. De esta clase nos interesa
 * saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá
 * cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
 * (suponiendo que en cada piso hay una oficina). Crear el método
 * cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas
 * en todo el edificio.
 *
 * 16 Por último, en el main vamos a crear un ArrayList de tipo Edificio. El
 * ArrayList debe contener dos polideportivos y dos edificios de oficinas.
 * Luego, recorrer este array y ejecutar los métodos calcularSuperficie y
 * calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el
 * volumen de cada edificio. Además de esto, para la clase Polideportivo nos
 * interesa saber cuántos polideportivos son techados y cuantos abiertos. Y para
 * la clase EdificioDeOficinas deberemos llamar al método cantPersonas() y
 * mostrar los resultados de cada edificio de oficinas.
 */
public class EjEdificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> lugares = new ArrayList<>();

        Edificio e1 = new Polideportivo("lala", true, 20d, 6d, 30d);
        Edificio e2 = new Polideportivo("lola", false, 20d, 6d, 30d);
        Edificio e3 = new Polideportivo("lela", true, 20d, 6d, 30d);
        Edificio f1 = new EdificioDeOficinas(5, 4, 7, 10d, 21d, 7d);
        Edificio f2 = new EdificioDeOficinas(3, 2, 4, 8d, 15d, 8d);
        lugares.add(e1);
        lugares.add(e2);
        lugares.add(e3);
        lugares.add(f1);
        lugares.add(f2);

        for (Edificio lugar : lugares) {
            if (lugar instanceof Polideportivo) {
                System.out.println("El polideportivo " + ((Polideportivo) lugar).getNombre() + "es techado: " + ((Polideportivo) lugar).isTechado());
                System.out.println("la superfice del Poli es de " + lugar.calcularSuperficie(lugar.getAncho(), lugar.getLargo()));
                System.out.println("Y el volumen del edificio es de: " + lugar.calcularvolumen(lugar.getAlto(), lugar.getAncho(), lugar.getLargo()));
            } else if (lugar instanceof EdificioDeOficinas) {
                System.out.println("El Edificio de oficinas de " + lugar.calcularSuperficie(lugar.getAncho(), lugar.getLargo()));
                ((EdificioDeOficinas) lugar).calcularpersonas();
                System.out.println("Y el volumen del edificio es de: " + lugar.calcularvolumen(lugar.getAlto(), lugar.getAncho(), lugar.getLargo()));
            }
            

        }
    }

}
