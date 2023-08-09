/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import pooej03.Operacion;

/**
 *
 * @author MAR
 */
public class POOEj3 {

  
    public static void main(String[] args) {
      Operacion op1 = new Operacion();  
      op1.crearOperacion();
      op1.suma();
      op1.resta();
      
      op1.div();
      op1.mul();
    }
    
}