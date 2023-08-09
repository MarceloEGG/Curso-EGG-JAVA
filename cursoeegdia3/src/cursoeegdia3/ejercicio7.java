/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoeegdia3;

import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        String rs;
        do {
            System.out.println("Digite una frase  una frase RS232->");
            rs = leer.nextLine();
            if (rs.length() == 5 && rs.startsWith("X") && rs.endsWith("O")) {
                correcto++;
            } else {
                incorrecto++;
            }
        } while (!rs.equals("&&&&&"));
        incorrecto--;
        System.out.println("Informe");
        System.out.println("Mensajes  RS 232 correctos " + correcto);
        System.out.println("Mensajes RS232 incorrectos " + incorrecto);
    }

}
