/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//AutorServicio
//Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
//administrar autores (consulta, creación, modificación y eliminación).
package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import persistencia.DAO.autorDAO;

public class AutorServices {

    private final autorDAO DAO;
private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public AutorServices() {
        this.DAO = new autorDAO();
    }

//    public Autor crearAutor(String nombre, Boolean Alta) {
//
//        Autor Au = new Autor();
//        try {
//            if (nombre == null || Alta == null) {
//                throw new IllegalArgumentException("Nombre y Alta no pueden ser nulos.");
//            }
//            if (nombre.equalsIgnoreCase(DAO.buscarPornombre(nombre).getNombre())) {
//
//                System.out.println("El autor ya se encuentra en el registro");
//                return null;
//            } else {
//                Au.setNombre(nombre);
//                Au.setAlta(true);
//                DAO.guardar(Au);
//
//                return Au;
//
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return null;
//        }
//    }
      public Autor crearAutor(String nombre, Boolean Alta) {

        Autor Au = new Autor();
        try {
            if (nombre == null || Alta == null) {
                throw new IllegalArgumentException("Nombre y Alta no pueden ser nulos.");
            }

//             Verificar si el autor ya existe en la base de datos
            Autor autorExistente = DAO.buscarPornombre(nombre);
            if (autorExistente != null) {
                System.out.println("El autor ya se encuentra en el registro.");
                return null;
            }else{

        
//             Si el autor no existe, crear uno nuevo
            Au.setNombre(nombre);
            Au.setAlta(true);
            DAO.guardar(Au);
            return Au;
            
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
     
    }
      public void altaBaja() throws Exception {
    System.out.println("Ingrese el nombre del autor:");
    String nombreAutor = leer.next();
    
    Autor autor = DAO.buscarPornombre(nombreAutor);
    if (autor != null) {
        if (autor.getAlta()) {
            autor.setAlta(false);
            DAO.editar(autor);
            System.out.println("El autor " + autor.getNombre() + " ha sido dado de baja.");
        } else {
            autor.setAlta(true);
            DAO.editar(autor);
            System.out.println("El autor " + autor.getNombre() + " ha sido dado de alta.");
        }
    } else {
        System.out.println("El autor no existe en la base de datos.");
    }
}
//         public void altaBaja() throws Exception{
//             System.out.println("ingrese nombre de autor");
//             String aux = leer.next();
//             if (aux.equalsIgnoreCase(DAO.buscarPornombre(aux).getNombre()) ){
//                 if (DAO.buscarPornombre(aux).getAlta() == true){
//                 DAO.editar(DAO.buscarPornombre(aux).setAlta(false);
//                         }else{
//                                 DAO.editar(DAO.buscarPornombre(aux).setAlta(true);
//                                 }
//             }
//        }
}

