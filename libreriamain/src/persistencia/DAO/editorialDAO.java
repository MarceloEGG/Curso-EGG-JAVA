/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package persistencia.DAO;

import java.util.List;
import libreria.entidades.Editorial;


public class editorialDAO extends DAO<Editorial> {

     public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editorial = em.createQuery("SELECT m FROM Editorial m ").getResultList();
        desconectar();
        return editorial;
    }
       public Editorial buscarPornombre(String nombre) throws Exception {
        conectar();
           try {
               Editorial editorial = (Editorial) em.createQuery("SELECT m FROM Editorial m WHERE m.nombre=:nombre").setParameter("nombre", nombre).getSingleResult();
            return editorial;
           } catch (Exception e) {
               System.out.println("El Editorial no se encuentra en la lista");
                 return null;
           }finally{
      
         desconectar();
           }
    }
    @Override
    public void guardar(Editorial objeto) {
        super.guardar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void editar(Editorial objeto) {
        super.editar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void eliminar(Editorial objeto) {
        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
