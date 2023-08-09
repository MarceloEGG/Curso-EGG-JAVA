/*
Crea una clase "Juego" que tenga un método "iniciar_juego" 
que permita a dos jugadores jugar un juego de adivinanza de 
números. El primer jugador elige un número y el segundo jugador 
intenta adivinarlo. El segundo jugador tiene un número limitado 
de intentos y recibe una pista de "más alto" o "más bajo" después 
de cada intento. El juego termina cuando el segundo jugador adivina 
el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número y 
el número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class Juego {

    Scanner leer = new Scanner(System.in);

    String jug1;

    String jug2;

    int intentos2;

    int correcto2;

    int intentos1;

    int correcto1;

    int num;

    int num2;

    public Juego() {
    }

    public Juego(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void Incio() {

        System.out.println("Ingrese nombrer de jugador: ");
        jug1 = leer.nextLine();
        System.out.println("");

        System.out.println("Ingresa el númro a adivinar: ");
        num = leer.nextInt();
        System.out.println("");

        int rango_mayor = num + 5;

        int rango_menor = num - 5;

        int intentos1 = 1;

        int correcto1 = 0;

        System.out.println("El número a adivinar esta entre: " + rango_mayor + " y " + rango_menor);
        System.out.println("");
        System.out.println("Partivcipante n°2:");
        System.out.println("Tiene tres intentos para adivinar el número secreto:");

        for (int i = 0; i < 3; i++) {

            num2 = leer.nextInt();

            if (num != num2) {
                System.out.println("Incorrecto, intento numero " + i);
                intentos1 += 1;
            } else if (intentos1 == 2) {

                System.out.println("Usaste todos tus intentos, perdiste");

            } else {

                System.out.println("descubriste el número secreto!!!");
                correcto1 += 1;
                break;
            }

        }

        System.out.println("Ingrese nombrer de jugador: ");
        jug1 = leer.nextLine();
        System.out.println("");

        System.out.println("Ingresa el númro a adivinar: ");
        num = leer.nextInt();
        System.out.println("");

        rango_mayor = num + 5;

        rango_menor = num - 5;

        int intentos2 = 1;

        int correcto2 = 0;

        System.out.println("El número a adivinar esta entre: " + rango_mayor + " y " + rango_menor);
        System.out.println("");
        System.out.println("Partivcipante n°2:");
        System.out.println("Tiene tres intentos para adivinar el número secreto:");

        for (int i = 0; i < 3; i++) {

            num2 = leer.nextInt();

            if (num != num2) {
                System.out.println("Incorrecto, intento numero " + i);
                intentos2 += 1;

            } else {

                System.out.println("descubriste el número secreto!!!");
                correcto2 += 1;
                break;
            }

        }

    }

    public void MensajeFinal() {

        System.out.println("El número de intentos fue: " + (this.intentos1 + this.intentos2) + "\n" + "Los aciertos fueron: " + (this.correcto1 + this.correcto2));

    }}
