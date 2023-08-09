/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Objects;

/**
 La clase Libro debe guardar el título del libro,
autor, número de ejemplares y número de ejemplares prestados. También se creará en
el main un HashSet de tipo Libro que guardará todos los libros creados.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.autor);
        hash = 79 * hash + this.ejemplares;
        hash = 79 * hash + this.prestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.ejemplares != other.ejemplares) {
            return false;
        }
        if (this.prestados != other.prestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "Libro:" + titulo + ", autor:" + autor + ", ejemplares de la biblioteca:" + ejemplares + ", prestados:" + prestados ;
    }
    
}
