/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaEncuentro4a6;

import java.util.Scanner;

/**
 *
 * @author cejas
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de motor");
        int motor = sc.nextInt();
        //switch no lleva la s en mayuscula porque es una condicional y no una clase
        switch  (motor) {
        case 1:
            System.out.println("La bomba es una bomba de agua");
         break;
         case 2:
            System.out.println("La bomba es una bomba de gasolina");
         break;
         case 3:
            System.out.println("La bomba es una bomba de hormigon");
         break;
         case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
         break;
         default:
            System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}
