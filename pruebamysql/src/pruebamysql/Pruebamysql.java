/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MAR
 */
public class Pruebamysql {

    private static final String url = "jdbc:mysql://localhost:3306/prueba";
    private static final String user = "root";
    private static final String password = "root";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    try {
        Connection cn = DriverManager.getConnection(url, user, password);
        System.out.println("Conecto");
   } catch (Exception e) {
        System.out.println(e.getMessage());
       }
String nombre ="juan";
String apellido = "Garcia";
int edad= 34;

crearAlumno(nombre,apellido,edad);
    }
    public  static void crearAlumno(String nombre, String apellido, int edad){
      try{
          Connection cn = DriverManager.getConnection(url, user, password);
          PreparedStatement pst = cn.prepareStatement("insert into alumno values(?,?,?,?)");
          pst.setInt(1,2);
          pst.setString(2,nombre);
          pst.setString(3, apellido);
          pst.setInt(4,edad);
          pst.executeUpdate();
      }catch(Exception e){
          System.out.println("no se cargaron los datos");
          System.out.println(e.getMessage());
      }
    }

}
