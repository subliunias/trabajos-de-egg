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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        System.out.println("ingrese un numero");
        num= new Scanner(System.in).nextInt();
        
        if (num % 2 ==0){
            System.out.println("el numero ingresado es par");
        } 
        else {
            System.out.println("el numero ingresado es impar");
        }
    }
    
}
