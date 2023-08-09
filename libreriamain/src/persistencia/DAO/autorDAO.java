/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package persistencia.DAO;

import java.util.List;
import libreria.entidades.Autor;


public class autorDAO extends DAO<Autor> {

      public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT m FROM Autor m ").getResultList();
        desconectar();
        return autores;
    }
       public Autor buscarPornombre(String nombre) throws Exception {
        conectar();
           try {
               Autor autor = (Autor) em.createQuery("SELECT m FROM Autor m WHERE m.nombre=:nombre").setParameter("nombre", nombre).getSingleResult();
            return autor;
           } catch (Exception e) {
               System.out.println("El autor no se encuentra en la lista");
                 return null;
           }finally{
      
         desconectar();
           }
    }

    @Override
    public void editar(Autor objeto) {
        super.editar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void eliminar(Autor objeto) {
        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
