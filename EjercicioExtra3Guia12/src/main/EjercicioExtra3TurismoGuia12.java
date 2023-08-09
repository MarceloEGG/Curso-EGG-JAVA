/*
 Una compañía de promociones turísticas desea mantener información sobre la infraestructura 
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de 
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de 
alojamientos: Hoteles y Alojamientos Extrahoteleros. 
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las 
características de las distintas categorías son las siguientes: 
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier 
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro 
será. 
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) + (valor agregado por limosinas). 
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. 
• $30 si el tipo del gimnasio es B. 
Valor agregado por las limosinas: 
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 

*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import Servicio.ResidenciaService;
import java.util.Scanner;

/**
 *
 * @author Mauro
 */
public class EjercicioExtra3TurismoGuia12 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("--------Menu Alojamientos--------");
ResidenciaService e1=new ResidenciaService();
e1.llenarLista();
//        Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
////• todos las residencias que tienen descuento.
System.out.println("Que desea visulizar");
        System.out.println(
                "1.todos los alojamientosn.\n"+
                "2.Todos los hoteles de más caro a más barato.\n"+
                "3.todos los campings con restaurante.\n"+
       "4.todos las residencias que tienen descuento.");
        
            int aux= leer.nextInt();
    switch (aux){
        case 1: e1.mostrarLista();
        break;
        case 2:  e1.mostrarHoteles();
        break;
        case 3: e1.mostrarcamping();
        break;
        case 4: e1.mostrarresidencias();
        break;
        default: System.out.println("no es una opcion valida");
    }
    }

}
