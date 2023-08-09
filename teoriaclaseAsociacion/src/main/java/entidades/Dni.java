package entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAR
 */
public class Dni {
    private char tipo;
    private int numero;

    public Dni() {
    }

    public Dni(char tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "dni{" + "tipo=" + tipo + ", numero=" + numero + '}';
    }
}
