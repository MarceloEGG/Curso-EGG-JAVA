//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

package services;

import entidad.alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MAR
 */
public class claseServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public  void crearAlumno(ArrayList<alumno> clase){
       boolean continuar=true;
       
       while(continuar){
           alumno a1 = new alumno();
        System.out.println("Ingrese nombre de alumno");
       a1.setNombre(leer.next());
        ArrayList<Integer> nota = new ArrayList<>();
           for (int i = 0; i < 3; i++) {
               System.out.println("Ingrese las notas del alumno "+(i+1));
               nota.add(leer.nextInt());
           }
           a1.setNotas(nota);
           clase.add(a1);
           System.out.println("Desea ingresar otro alumno");
           continuar= leer.next().equalsIgnoreCase("s");
       }
   
}
    public void notaFinal(ArrayList<alumno> clase){
        System.out.println("ingrese nombre del alumno a evaluar");
        String al = leer.next();
        int suma=0;
        Iterator<alumno> it = clase.iterator();
        boolean der=false;
        
        for (alumno object : clase) {
            
        }
        
        
        for (alumno ver : clase) {
            if (ver.getNombre().equalsIgnoreCase(al)) {
                der = true;
                for (int nota : ver.getNotas()) {
                    
                    suma += nota;
                }
                
                System.out.println("El promedio es: "+suma/3);
            }
            
        }
        if (!der) {
            System.out.println("El alumno no se encontró.");
        }
        
//        while(it.hasNext()){
//            String nomb = it.next().getNombre();
//            if (nomb.equalsIgnoreCase(al)){
//                
////                for (int nota : it.next().getNotas()) {
////                    
////                    suma += nota;
////                }
//                for (int i = 0; i < 3; i++) {
//               int aux = it.next().getNotas().get(i);
//                  suma = aux+suma;       
//                }
//                System.out.println("El promedio del alumno es"+(suma/3));
//            }else{
//                der=true;
//            }
//            if (der){
//                System.out.println("No se encontro el alumno");
//            }
    }

}
