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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese una palabra de 8 letras");
        
        String frase= sc.nextLine();
        
        if(frase.length()==8){
            System.out.println("CORRECTO");
        } else{ 
            System.out.println("INCORRECTO");
        }
    }
    
}
