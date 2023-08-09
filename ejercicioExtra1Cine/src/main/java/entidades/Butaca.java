/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author MAR
 */
public class Butaca {
    private String fila;
    private String columna;
    private String ocupado;

    public Butaca() {
    }

    public Butaca(String fila, String columna, String ocupado) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Butaca{" + "fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + '}';
    }

    
    
}
