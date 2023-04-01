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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Random aleatorio = new Random(100);
        
        int vector[] = new int [30];
        
        for (int i = 0; i<vector.length; i++){
           vector[i] = aleatorio.nextInt(80);
        }
        System.out.println("se muestra el vector ");
        
        for(int i = 0; i<vector.length; i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("ingrese un numero a buscar");
        int num = sc.nextInt();
        int c=0;
        
        for(int i = 0; i<vector.length; i++){
            if(num == vector[i]){
                c++;
                System.out.println("el  numero se encuentra repetido "+c+"vez/veces");
                System.out.println("en la posicion: " +"["+(i+1)+"]");
            }
        }
    }
    
}
