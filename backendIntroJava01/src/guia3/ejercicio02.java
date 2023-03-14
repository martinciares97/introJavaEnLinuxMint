/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author cuni
 */
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean flag_entry = true;
        
        while(flag_entry) {
            System.out.println("Ingrese una frase");
            String frase = input.nextLine();

            if(!"eureka".equals(frase)) {
                System.out.println("Cadena incorrecta");

            } else {
                System.out.println("Cadena correcta");
                flag_entry = false;
            }
        }
    }
}
/*
2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. 
Nota: investigar la función equals() en Java.
*/