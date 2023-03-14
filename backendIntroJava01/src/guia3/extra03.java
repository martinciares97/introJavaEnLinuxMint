/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

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
            String letra = toUpperCase(leer.next());
        
            if(!"A".equals(letra) && !"E".equals(letra) && !"I".equals(letra) && 
            !"O".equals(letra) && !"U".equals(letra)) {
            System.out.println("La letra ingresada no es una vocal");
        } else {
            System.out.println("La letra ingresada es una vocal");
            }
        }
    }
}
/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 || !"E".equals(letra) || !"I".equals(letra) || !"O".equals(letra) || !"U".equals(letra)
*/

/*
import java.util.Scanner;

public class DetectarVocal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una letra: ");
        char letra = sc.next().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada NO es una vocal.");
        }
    }

}

*/