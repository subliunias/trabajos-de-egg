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
public class ejergicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese una palabra");
        
        String frase = sc.nextLine();
        
        String frase1 = "eureka";
        
        if(frase1.equals(frase)){
            System.out.println("correcto!");
        } else{
             System.out.println("incorrecto!");
        }
    }
    
}
