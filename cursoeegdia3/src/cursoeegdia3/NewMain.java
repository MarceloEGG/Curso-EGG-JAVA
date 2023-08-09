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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 8;
                int num2 = 7;
                        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num2; j++) {
                if (j==0 || j==num2){
                    System.out.print(" ");
                }else{
                    System.out.println("*");
                }
                System.out.println("");
            }
            
        }
    }
    
}
