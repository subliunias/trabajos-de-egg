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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String opc;
        boolean c = true;
        String s, n;
        
        do{
            System.out.println("ingrese nombre");
            String nombre = sc.next();
            System.out.println("ingrese la edad");
            int edad = sc.nextInt();
            imprimir(nombre, edad);
            System.out.println("quiere seguir ingresando personas (s/n)?");
            opc = sc.next();
            
            if (opc.equalsIgnoreCase("s")){
                c = true;
            }else{
                c=false;
            }
        } while (c == true);
        System.out.println("gracias por utilizar el sistema");       
    }
    public static void imprimir(String nombre, int edad){
        if (edad>= 18){
            System.out.println("el nombre de la persona es: "+nombre+ " y la edad es: "+edad);
            System.out.println("es mayor de edad");
        } else{
            System.out.println("el nombre de la persona es: "+nombre+ " y la edad es: "+edad);
            System.out.println("es menor de edad");
        }
    }
}
