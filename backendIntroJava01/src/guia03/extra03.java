/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia03;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author cuni
 */
public class extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean flag_entry = true;
        
        while(flag_entry) {
            System.out.println("Ingrese una letra");
            String letra = leer.next();
        
            if(!"A".equalsIgnoreCase(letra) && !"E".equalsIgnoreCase(letra) && 
            !"I".equalsIgnoreCase(letra) && !"O".equalsIgnoreCase(letra) && 
            !"U".equalsIgnoreCase(letra)) {
            System.out.println("La letra ingresada no es una vocal");
        } else {
            System.out.println("La letra ingresada es una vocal");
            }
        }
    }
}
/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 || !"E".equals(letra) || !"I".equals(letra) || !"O".equals(letra) || !"U".equals(letra)
*/
