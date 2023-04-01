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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        int contCor, contInc;
        
        contCor = 0;
        contInc = 0;
        
        while (true){
            System.out.println("Introduce tu cadena de longitud 5 e Indique &&&&& para salir \nDebe comenzar con (x) y terminar con (o) para ser valido");
            cadena = sc.nextLine();
            if(cadena.equals("&&&&&")){
                break;
            }
            if(cadena.substring(0,1).equals("x") && cadena.substring(cadena.length()-1,cadena.length()).equals("o") &&cadena.length()==5){
               System.out.println("Enviado correctamente");
               contCor+=1;
            }
            else{
                 System.out.println("Enviado incorrectamente");
               contInc+=1;
            }
        }
        System.out.println("\nCantidad de envios correctos: "+contCor+"\nCantidad de envios incorrectos: "+contInc);
    }
    //\n sirve para escribir en otra linea.
}
