/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAR
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j==0 || j==8 || i==0 || i==8){
                    System.out.print("*");
                }else 
                    System.out.print(" ");
            }
            System.out.println("");
            }
            
        }
    }
    

