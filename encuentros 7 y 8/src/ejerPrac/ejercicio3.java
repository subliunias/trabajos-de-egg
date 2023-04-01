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
        double cant;
        
        System.out.println("ingrese la cantidad de euros a converitr");
        double euros = sc.nextDouble();
        System.out.println("elija el tipo de moneda a convertir:"
                +"\n L- libra"
                +"\n D- dolar"
                +"\n Y- yenes");
        String moneda = sc.next();
        
        switch (moneda){
            case "l": case "L":
                convertir(euros, moneda);
                break;
             case "d": case "D":
                convertir(euros, moneda);
                break;
             case "y": case "Y":
                convertir(euros, moneda);
                break; 
             default:
                 System.out.println("opcion invalida, vuelva a intentar");
                 break;
        }
    }
    public static void convertir(double euros, String moneda){
        if(moneda.equalsIgnoreCase("l")){
            double cant=(euros*0.86);
            System.out.println("la conversion de euro a LIBRA es: "+cant);
        }
         if(moneda.equalsIgnoreCase("d")){
            double cant=(euros*1.28611);
            System.out.println("la conversion de euro a DOLAR es: "+cant);
         }
          if(moneda.equalsIgnoreCase("y")){
            double cant=(euros*129.852);
            System.out.println("la conversion de euro a YENES es: "+cant);
          }
    }
}
