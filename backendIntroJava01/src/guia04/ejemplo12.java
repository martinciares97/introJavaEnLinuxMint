/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia04;

import java.util.Scanner;

/**
 *
 * @author cuni
 */
public class ejemplo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese dos numero");
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        
        esMultiplo(numA, numB);
        
    }
    public static void esMultiplo(int numero1, int numero2) {
        if(numero1 % numero2 == 0) {
            System.out.println("Es multiplo");
        } else {
            System.out.println("no es multiplo");
        }
    }
    
    
}
/*
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer  número sea múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
*/