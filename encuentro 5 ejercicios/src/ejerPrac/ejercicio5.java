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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int limit, suma;
        suma=0;
        
        System.out.println("introduzca el limite en valor positivo");
        do{
            limit=sc.nextInt();
        } while (limit<1);
        
        do{
            System.out.println("introduzca un numero para suarlo");
            suma+= sc.nextInt();
        } while (suma<=limit);
        System.out.println("la suma total es: "+suma);
    }
    }
    

