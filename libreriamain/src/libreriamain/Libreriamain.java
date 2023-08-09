/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriamain;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.servicios.AutorServices;
import libreria.servicios.editorialServices;
import libreria.servicios.libroServices;

public class Libreriamain {

    public static void main(String[] args) throws Exception {

        AutorServices au = new AutorServices();
        editorialServices ed = new editorialServices();
        libroServices em = new libroServices();
        Autor autor1 = au.crearAutor("nuevo", true);
        Editorial editorial1 = ed.crearEditorial("Editorial_1", true);
        
            em.crearLibro(Long.MIN_VALUE, titulo, Integer.SIZE, Integer.BYTES, Integer.MAX_VALUE, Integer.MAX_VALUE, Boolean.FALSE, autor1, editorial1)
au.altaBaja();

    }
}
