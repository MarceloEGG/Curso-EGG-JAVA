/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import persistencia.DAO.libroDAO;




public class libroServices {
private final libroDAO DAO;
private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public libroServices() {
        this.DAO = new libroDAO();
    }
public Libro crearLibro(Long ISBN, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplareRestantes, Boolean Alta, Autor autor, Editorial editorial) throws Exception{

        Libro libro = new Libro();
        List <Libro> libros = DAO.listarTodos();
        try {
            if (ISBN == null || titulo == null || anio == null || ejemplares == null || ejemplaresPrestados == null || ejemplareRestantes == null || autor == null || editorial == null || Alta == null) {
            throw new IllegalArgumentException("Los cammpos deben estar completos, no pueden ser nulos.");
        }
//            realizar la validacion con busqueda
//if (!titulo.equalsIgnoreCase(DAO.buscarPorTitulo(titulo).getTitulo())){
            libro.setISBN(ISBN);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplareRestantes(ejemplareRestantes);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setAlta(Alta);
         
            DAO.guardar(libro);
            return libro;
//}else{
//    
//    System.out.println("El libro ya esta cargado");
//    return null;
//}
//            for (Libro aux : libros) {
//                if (titulo.equals (aux.getTitulo())){
//                    
//                }
//            }

          
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
}
    
//public void AltaBaja (){
// 
//    System.out.println("Ingrese nombre del Libro");
//    String libroA=
//}
}


