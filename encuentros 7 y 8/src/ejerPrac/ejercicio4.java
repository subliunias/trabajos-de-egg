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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        System.out.println(" se devolvera true si el numero es primo y false si no lo es");
        int num = sc.nextInt();
        
        primo(num);
        
        
        
    }
    public static void primo(int num){
        int cont = 0;
        boolean res;
        for(int i = 1; i < num; i++){
            if (num%i==0){
                cont++;
            }
        }
            if(cont<2){
                res = true;
                System.out.println("el numero ingresaso ES PRIMO");
            }else{
                res = false;
                System.out.println("el numero ingresado NO ES PRIMO");
            }
    }
}
