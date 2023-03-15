/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia03;

import java.util.Scanner;

/**
 *
 * @author cuni
 */
public class extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera");
        int altura = sc.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i +1; j++) {
                System.out.print(j +1);
            }
            System.out.println(" ");
        }
    }
    
}
/*
13. Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123
*/