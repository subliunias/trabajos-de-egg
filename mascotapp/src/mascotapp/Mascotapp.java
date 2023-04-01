
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class Mascotapp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
      Mascota m1 = new Mascota("shiva cejas", sc.next() , "gato");
      
      //cuando la clase es publica se puede poner la varieble y poner un punto para acceder a las distintas partes
      
//      m1.apodo = "shiva";
 
           m1.setNombre("kikikiki");
            m1.pasear(100, 4);
            
       System.out.println(m1);

    }
    
}
