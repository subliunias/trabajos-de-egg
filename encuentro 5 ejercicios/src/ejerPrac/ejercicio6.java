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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int num1, num2, opc;
        
        System.out.println("introduzca dos numeros");
        
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        String opcSalir = " ";
        
        while(!opcSalir.equalsIgnoreCase("s")){
            System.out.println("Elige una opcion: ");
            System.out.println("-1 (Sumar)"
            +"-2 (Restar)"
            +"-3 (Multiplicar)"
            +"-4 (Dividir)"
            +"-5 (Salir)");
            opc= sc.nextInt();
                switch(opc){
                case 1:
                    System.out.println("Numero 1 = "+num1+" Numero 2 = "+num2+" La suma de los dos numeros es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Numero 1 = "+num1+" Numero 2 = "+num2+" La resta de los dos numeros es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Numero 1 ="+num1+" Numero 2 = "+num2+" La multiplicacion de los dos numeros es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Numero 1 ="+num1+" Numero 2 = "+num2+" La division de los dos numeros es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Desea salir del sistema? (s/n)");
                    opcSalir= sc.next();
                    if(opcSalir.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo del sistema...");
                    }
                    break;
                default:
                    System.out.println("Elige una opcion correcta...");
                }
        }
        
        
        
    }
    
}
