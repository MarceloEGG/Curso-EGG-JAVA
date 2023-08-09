/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package persistencia.DAO;

import java.util.List;
import libreria.entidades.Libro;


public class libroDAO extends DAO<Libro>{

        public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m ").getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarPorId(String id) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.id").setParameter("id", id).getSingleResult();
        desconectar();
        return libro;
    }
    public Libro buscarPorTitulo(String titulo) throws Exception {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.titulo").setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }

    @Override
    public void eliminar(Libro libro) {
        super.eliminar(libro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
    
    

