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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cent = new Scanner(System.in);
        
        System.out.println("ingrece la temperatura en grados centigrados: ");
        
        //investigar double...
        double temp = cent.nextDouble();
        double Fahren = 32 + (9* temp / 5);
        
        System.out.println("los: " + temp + "°c, equivalen a: " + Fahren + "°f");
    }
    
}
