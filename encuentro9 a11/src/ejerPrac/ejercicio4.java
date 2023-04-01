/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerPrac;

import java.util.Random;

/**
 *
 * @author cejas
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio = new Random();
        int matriz[][] = new int [4][4];
        int mTras[][] = new int [4][4];
        
        for(int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                matriz[i][j]= aleatorio.nextInt(20);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            } 
            System.out.println("");
        }
        System.out.println("");
        System.out.println("******************************************************");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.println("");
        }
    }
    
}
