/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 *
 * @author MAR
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int Paginas;

    public Libro(int ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }

    public Libro() {
        
    }

    public void carga() {

        System.out.println("ingrese el nombre de libro");
        Scanner leer = new Scanner(System.in);
        this.Titulo = leer.nextLine();
        System.out.println("Ingrese Autor");
        this.Autor = leer.nextLine();
        System.out.println("Ingrese cantidad de pagina");
        this.Paginas = leer.nextInt();
        this.ISBN = (int) (Math.random() * 9999);
    }   
public void muestra() {
    System.out.println("Titulo " + this.Titulo +"\n" + "Autor " + this.Autor + "\n" + "Numero de Páginas "+ +this.Paginas + "\n"+ "ISBN "  + this.ISBN);
}
}