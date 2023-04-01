/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerPrac;

import java.util.Scanner;

/**
 *
 * @author cejas
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc= new Scanner(System.in);
        int matriz[][] = new int [3][3];
       // System.out.println("ingrese valores para la matriz (entre 1 y 9)");
        
        
      
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               do{
                   System.out.println("introduzca un numero para la poscicion: |"+i+ "|"+" |"+j+"|"+" debe ser un valor (entre 1y9)");
                   matriz[i][j]=sc.nextInt();
                   while(matriz[i][j]<1 || matriz[i][j]>9){
                       System.out.println("numero invalido. ingrese nuevamente  para la posicion: |"+i+" | "+j+"| (DEBE SER ENTRE 1 Y 9)");
                       matriz[i][j] = sc.nextInt();
                   }
               } while(matriz[i][j]<1 && matriz[i][j]>9);
            }
        } 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|"+matriz[i][j]+" | ");
            }
            System.out.println("");
        }
    }
}
