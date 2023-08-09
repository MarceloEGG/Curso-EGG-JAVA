/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class cartaespaniola40 {
Scanner leer = new Scanner(System.in);
    
    public void crearCarta( ArrayList<Carta> mazo){
        String[] palo = new String[4];
        palo[0]="Oro";
        palo[1]="Espada";
        palo[2]="Basto";
        palo[3]="Copa";
        
        for (int i = 0; i < 4 ;i++){
            Carta c1=new Carta();
            c1.setPalo(palo[i]);
                        for (int j = 0; j < 10; j++) {
                if ((j==9)&&(j==10)){
                c1.setNumero(j+2);
                mazo.add(c1);
        }

            }
            }
    }
    //crear servicio mazoPoker y mazoEspaniola50
    
    public void barajar( ArrayList<Carta> mazo){
Collections.shuffle(mazo);
    }
    
/*siguienteCarta(): devuelve la siguiente 
carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay 
más cartas.*/
  public void  siguienteCarta (ArrayList<Carta> mazo,ArrayList<Carta> cartasRestante){
      if (mazo.size()==0){
          System.out.println("No hay mas cartas para mostrar");
      }else{
              System.out.println(mazo.get(0).getNumero()+mazo.get(0).getPalo());    
                  }
      cartasRestante.add(mazo.get(0));
      mazo.remove(0);
      
      }
  public void cartasDisponibles(ArrayList<Carta> mazo){
      for (Carta carta : mazo) {
          System.out.println(   carta.toString()+"\n");
      }
  }
/*  darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.*/
  public void darCartas(ArrayList<Carta> mazo,ArrayList<Carta> cartasRestante){
      System.out.println("Indique cantidad de cartas a repartir");
      int aux = leer.nextInt();
      if (mazo.size()<aux){
          System.out.println("Las cartas en el mazo son insuficientes para repartir");
      }else{
          for (int i = 0; i < aux; i++) {
             siguienteCarta(mazo,cartasRestante);
             
          }
      }
  }
  public void cartasMonton(ArrayList<Carta> cartasRestante){
      for (Carta carta : cartasRestante) {
          System.out.println(carta.toString()+"\n");
      }
      }
        /*mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/
  public void mostrarMazo(ArrayList<Carta> mazo){
      for (Carta carta : mazo) {
          System.out.println(carta.toString()+"\n");
      }
  }

  
  }
  

