/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testa;

import java.util.Scanner;

/**
 *
 * @author cejas
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // siempre terminar la linea con punto y coma (;)
        
        //Scanner es lo mismo que leer en psint
        Scanner input = new Scanner (System.in);
        
        System.out.println("programa que calcula la suma de dos valores");
        // System.out.println se usa para imprimir en pantalla un texto
        
        System.out.println("ingresar el primer valor: ");
        int num1 = input.nextInt();
        //input.nextInt es para ingresar algo
        
          System.out.println("ingresar el primer valor: ");
          int num2 = input.nextInt();
           
          int suma = num1 + num2;
          System.out.println("la suma del valor " + num1 + " y del valor " + num2 + " da como resultado: " + suma);
          
    }
    
}
