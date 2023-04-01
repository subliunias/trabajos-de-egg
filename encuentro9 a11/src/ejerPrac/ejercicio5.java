/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerPrac;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cejas
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Scanner sc = new Scanner(System.in);
        int matriz[][] = {
           {0,-2,4},
            {2,0,2},
            {-4,-2,0}
        };
        
    /*    int mTras[][] = new int [3][3];
        System.out.println("ingrese los valores para la matriz");
        for(int i = 0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" |"+matriz[i][j]+"| ");
            } 
            System.out.println("");
        }
        */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                System.out.print(" |"+(matriz[i][j])+"| ");
            }
            System.out.println("");
        } 
        System.out.println("");
        System.out.println("******************************************************");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                System.out.print(" |"+(matriz[j][i])+"| ");
            }
            System.out.println("");
        }
        int c1=0;
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
        if(matriz[i][j] == -matriz[j][i]){
            c1++;
           if(c1==9){
               System.out.println("es una matriz antiseimetrica");
           }
        }
            }
          }
    }
}
    

