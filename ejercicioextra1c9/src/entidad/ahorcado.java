/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author MAR
 */
public class ahorcado {
    /*Juego Ahorcado: Crear una clase Ahorcado (como el juego), 
    la cual deberá contener como atributos, un vector con la palabra a buscar, 
    la cantidad de letras encontradas y la cantidad jugadas máximas que puede 
    realizar el usuario. Definir los siguientes métodos en AhorcadoService:*/
    
    private char [] palabra;
    private int  letras;
    private int jugadas;
   
    

    public ahorcado() {
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
}
    