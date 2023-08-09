/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author MAR
 */
import entidad.ahorcado;
import java.util.Scanner;

public class ahorcadoServices {
    Scanner Leer = new Scanner(System.in);
    
public ahorcado crearJuego(){
    ahorcado j1 = new ahorcado();
    
    System.out.println("Ingrese plabra para adivinar");
    String palabra = Leer.next();
    j1.setPalabra(palabra.toCharArray());
   int longitud = palabra.length();
    System.out.println("Ingrese jugadas maximas");
    j1.setJugadas(Leer.nextInt());
    
    return j1;
    
      /* Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
//    Con la palabra del usuario, pone la longitud de la palabra, 
//    como la longitud del vector. Después ingresa la palabra en el vector, 
//    letra por letra, quedando cada letra de la palabra en un índice del vector. 
//    Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.*/
//    public void crearjuego() 
    
   
}
public void metodolongitud(ahorcado p1){
    System.out.println("la longitud es"+ p1.getPalabra().length);
    
/*Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
Nota: buscar como se usa el vector.length.*/
}
public boolean  buscarLetra(ahorcado p1, String letra){
    
    
    
    int cont=0;
    
    for (int i = 0; i < p1.getPalabra().length; i++) {
        if  (letra.equalsIgnoreCase(String.valueOf(p1.getPalabra()[i])))
            cont++;
    }
    p1.setLetras(p1.getLetras()+cont);
        if (cont>0){
            return true;
        }else{
            return false;
        }
            
        
    
    
        
}  
/*Método buscar(letra):  este método recibe una letra dada por el usuario y 
busca si la letra ingresada es parte de la palabra o no. 
También informará si la letra estaba o no.*/

public void encontradas(ahorcado p1, String letra){
  boolean esta=buscarLetra( p1,  letra);
    System.out.println(esta);
  if (esta){
      System.out.println("La letra se encontro en la palabra");
      
  }else {
      System.out.println("La letra no se encuentra");
     p1.setJugadas(p1.getJugadas()-1);
      
  }
}

public void intentos(ahorcado p1){
    int encontradas=p1.getLetras();//encontradas
    int restantes=p1.getPalabra().length-p1.getLetras();
    System.out.println("usted a encontrado " +encontradas);
    System.out.println("le restan encontrar "+restantes);
    System.out.println( "le restan " + p1.getJugadas()+ " intentos");
}
public void juego(ahorcado p1){
    System.out.println("ingrese una letra");
    String letra = String.valueOf(Leer.next().charAt(0));
    
    encontradas( p1,  letra);
    intentos(p1);
    
}

/*Método juego(): el método juego se encargará de llamar todos 
los métodos previamente mencionados e informará cuando el usuario 
descubra toda la palabra o se quede sin intentos. Este método se llamará 
en el main.*/





}



/*Método encontradas(letra):  que reciba una letra ingresada por el usuario 
y muestre cuantas letras han sido encontradas y cuántas le faltan. 
Este método además deberá devolver true si la letra estaba y false si la 
letra no estaba, ya que, cada vez que se busque una letra que no esté, 
se le restará uno a sus oportunidades.
*/    
