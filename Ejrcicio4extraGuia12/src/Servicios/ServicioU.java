/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Empleados;
import Entidades.Estudiantes;
import Entidades.PersonalServicio;
import Entidades.Personas;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class ServicioU {

    ArrayList< Personas> persona = new ArrayList<>();
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarListas() {
        persona.add(new Estudiantes("Mate", "Juan", "Perez", 8, "soltero"));
        persona.add(new Estudiantes("Lengua", "Pedro", "Perez", 8, "casado"));
        persona.add(new Profesor("Mate", 1978, 35, "Seba", "Pade", 85, "Casado"));
        persona.add(new Profesor("Lengua", 1978, 35, "Seba", "Pade", 85, "Soltero"));
        persona.add(new PersonalServicio("Bibloteca", 2000, 58, "Julio", "Roca", 95, "casado"));
        persona.add(new PersonalServicio("Pasillo", 2000, 58, "Julio", "Roca", 95, "soltero"));
    }

    public void mostrarProfe() {
        for (Personas aux : persona) {
            if (aux instanceof Profesor) {
                System.out.println("Profesores");
                System.out.println(aux);
            }
        }
    }

    public void mostrarPersonal() {
        for (Personas aux : persona) {
            if (aux instanceof PersonalServicio) {
                System.out.println("Personal Servicio");
                System.out.println(aux);
            }
        }
    }

    public void mostrarEstudiantes() {
        for (Personas aux : persona) {
            if (aux instanceof Estudiantes) {
                System.out.println("Estudiante");
                System.out.println(aux);
            }
        }
    }

    public void menu() {

        System.out.println(
                "1.Cambio del estado civil de una persona.\n"
                + "2.Reasignación de despacho a un empleado.\n"
                + "3.Matriculación de un estudiante en un nuevo curso.\n"
                + "4.Cambio de departamento de un profesor.\n"
                + "5.Traslado de sección de un empleado del personal de servicio.");

        System.out.println(
                "indique que desea modificar");
        int aux3 = leer.nextInt();

        switch (aux3) {
            case 1:
                System.out.println(
                        "Indique el apellido de la persona que desea modificar");
                String aux1 = leer.next();
                for (Personas aux : persona) {
                    if (aux.getApellido().equalsIgnoreCase(aux1)) {
                        aux.cambiarEstadoCivil();
                    }

                }
                break;
            case 2:
                System.out.println(
                        "Indique el apellido de la persona que desea modificar");
                String aux2 = leer.next();

                for (Personas aux : persona) {
                    if (aux instanceof Empleados && aux.getApellido().equalsIgnoreCase(aux2)) {

                        ((Empleados) aux).cambiarDespacho();
                    }
                }
                break;

            case 3:
                System.out.println(
                        "Indique el apellido de la persona que desea modificar");
                String aux4 = leer.next();
                for (Personas aux : persona) {
                    if (aux instanceof Estudiantes && aux.getApellido().equalsIgnoreCase(aux4)) {
                        ((Estudiantes) aux).cambiarMatricula();
                    }

                }
                break;
            case 4:
                System.out.println(
                        "Indique el apellido de la persona que desea modificar");
                String aux5 = leer.next();
                for (Personas aux : persona) {
                    if (aux instanceof Profesor && aux.getApellido().equalsIgnoreCase(aux5)) {
                        ((Profesor) aux).cambiarDespacho();
                    }

                }
                break;
            case 5:
                System.out.println(
                        "Indique el apellido de la persona que desea modificar");
                String aux6 = leer.next();
                for (Personas aux : persona) {
                    if (aux instanceof PersonalServicio && aux.getApellido().equalsIgnoreCase(aux6)) {
                        ((PersonalServicio) aux).cambiarDespacho();
                    }
                }
                break;
        }
    }
}
