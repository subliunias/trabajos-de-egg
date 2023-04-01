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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio = new Random(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor limite");
        int limit = sc.nextInt();
        int vector[] = new int [limit];
        
        for(int i = 0; i<vector.length; i++){
               
            vector[i] = aleatorio.nextInt(99999);
           
        }
        
        for (int i = 0; i<10; i++){
            System.out.print("[" + vector[i]+ "]");
        }
        int c1=0, c2=0, c3=0, c4=0, c5=0;
        for(int i=0; i<vector.length; i++){
            if(vector[i]<10){
                c1++;
            }
            if(vector[i]>9 && vector[i]<100){
                c2++;
            }
            if(vector[i]>99 && vector[i]<1000){
                c3++;
            }
            if(vector[i]>999 && vector[i]<10000){
                c4++;
            }
            if(vector[i]>9999 && vector[i]<100000){
                c5++;
            }
        }
        System.out.println("");
        System.out.println("la cantidad de numeros de 1 digito es: "+ c1);
         System.out.println("la cantidad de numeros de 2 digitos es: "+ c2);
         System.out.println("la cantidad de numeros de 3 digitos es: "+ c3);
         System.out.println("la cantidad de numeros de 4 digitos es: "+ c4);
         System.out.println("la cantidad de numeros de 5 digitos es: "+ c5);
    }
    
}
