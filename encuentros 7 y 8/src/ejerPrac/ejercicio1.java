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
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("ingrese el segundo valor");
        int num2 = sc.nextInt();
        
        System.out.println("elija la operacion a realizar"
                + "\n 1- sumar"
                +"\n 2- restar"
                +"\n 3- multiplicar"
                +"\n 4- dividir");
        int opc = sc.nextInt();
        
        switch (opc){
            case 1:
                int s = suma(num1, num2);
                System.out.println("el resultado de la suma es: "+s);
                break;
            case 2:
                int r = resta(num1,num2);
                System.out.println("el resultado de la resta es: "+r);
                break;
            case 3:
                int m = multi(num1,num2);
                System.out.println("el resultado de la multiplicacion es: "+m);
                break;
            case 4:
                int d = div(num1,num2);
                System.out.println("el resultado de la multiplicacion es: "+d);
                break;
            default:
                System.out.println("el valor ingresado no es valido");
                break;
        }
    }
    public static int suma (int a, int b){
        int r = a + b;
        return r;
    }
    public static int resta(int a, int b) {
        int r = a - b;
       return r; 
    }
   public static int multi(int a, int b){
       int r = a*b;
       return r;
   }
   public static int div(int a, int b){
       int r = a/b;
       return r;
   }
}
