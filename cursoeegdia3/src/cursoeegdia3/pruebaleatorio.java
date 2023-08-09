/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoeegdia3;

/**
 *
 * @author MAR
 */
public class pruebaleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 9;
        int num2 = 10;

        for (int i = 0; i < 9; i++) {
            for (int j == 0; j < 10; j++) {
                if (j == 0 || j == 9) {
                    System.out.print(" ");
                    }else{
                            System.out.println("*");
                
                }
                System.out.println("");
            }

        }
    }
}
    //System.out.println('☻'+ Math.random() * 10");

    /*     String lala = "lala";
        int n = 9;
        
        String matriz[][]= new String [10][10];
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if (matriz[i][j]==null){
                    matriz[i][j] = (String.valueOf((char)('a'+ Math.random() * 23))); 
                }
                
            }
       }
            
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("{"+matriz[i][j] +"}");
                
            }
            System.out.println("");
        }/*
        
    
    
     }
