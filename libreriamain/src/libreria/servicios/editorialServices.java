/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Editorial;
import persistencia.DAO.editorialDAO;


public class editorialServices {
private final editorialDAO DAO;
private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public editorialServices() {
        this.DAO = new editorialDAO();
    }
public Editorial crearEditorial(String nombre,Boolean Alta){


        Editorial Au = new Editorial();
        try {
            if (nombre == null || Alta == null) {
                throw new IllegalArgumentException("Nombre y Alta no pueden ser nulos.");
            }

//             Verificar si la editorial ya existe en la base de datos
            Editorial EdiExistente = DAO.buscarPornombre(nombre);
            if (EdiExistente != null) {
                System.out.println("La editorial ya se encuentra en el registro.");
                return null;
            }else{

        
//             Si la editorial no existe, crear uno nuevo
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
    System.out.println("Ingrese el nombre del editorial:");
    String nombreEditorial = leer.next();
    
    Editorial editorial = DAO.buscarPornombre(nombreEditorial);
    if (editorial != null) {
        if (editorial.getAlta()) {
            editorial.setAlta(false);
            DAO.editar(editorial);
            System.out.println("El editorial " + editorial.getNombre() + " ha sido dado de baja.");
        } else {
            editorial.setAlta(true);
            DAO.editar(editorial);
            System.out.println("El editorial " + editorial.getNombre() + " ha sido dado de alta.");
        }
    } else {
        System.out.println("El editorial no existe en la base de datos.");
    }
}

}
