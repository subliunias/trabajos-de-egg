/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro2;

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
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingresar un texto:");
        
        String texto = leer.nextLine();
        
        //toUpperCase se usa para transformar el texto a mayuscula
        System.out.println("el texto en mayuscula es: "+ texto.toUpperCase());
        System.out.println("el texto en minuscula es: "+ texto.toLowerCase());
        //toLowerCase se usa para transformar el texto a minuscula
    }
    
}
