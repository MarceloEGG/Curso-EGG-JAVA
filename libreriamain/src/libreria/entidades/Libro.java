/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    private long id;
    
@Basic
private long ISBN;
private String titulo;
private Integer anio;
private Integer ejemplares;
private Integer ejemplaresPrestados;
private Integer ejemplareRestantes;
private Boolean Alta;
@ManyToOne
private Autor autor;
@ManyToOne
private Editorial editorial;

    public Libro() {
    }

    public Libro(long id, long ISBN, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplareRestantes, Boolean Alta, Autor autor, Editorial editorial) {
        this.id = id;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplareRestantes = ejemplareRestantes;
        this.Alta = Alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplareRestantes() {
        return ejemplareRestantes;
    }

    public void setEjemplareRestantes(Integer ejemplareRestantes) {
        this.ejemplareRestantes = ejemplareRestantes;
    }

    public Boolean getAlta() {
        return Alta;
    }

    public void setAlta(Boolean Alta) {
        this.Alta = Alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", ISBN=" + ISBN + ", titulo=" + titulo + ", anio=" + anio + ", ejemplares=" + ejemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + ", ejemplareRestantes=" + ejemplareRestantes + ", Alta=" + Alta + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

}
