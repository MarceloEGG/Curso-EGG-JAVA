/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
public final class Estudiantes extends Personas{
  private String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiantes{" + "curso=" + curso + '}';
    }
//  Matriculación de un estudiante en un nuevo curso.
    public void cambiarMatricula(){
        System.out.println("Ingrese nuevo curso");
        this.curso=leer.next();
    }
}
