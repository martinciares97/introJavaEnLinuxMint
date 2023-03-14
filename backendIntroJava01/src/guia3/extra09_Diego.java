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
public class extra09_Diego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer los valores del dividendo y divisor
        Scanner input = new Scanner(System.in);
            // Leer los valores del dividendo y divisor
            System.out.print("Ingrese el dividendo: ");
            int dividendo = input.nextInt();
            
            System.out.print("Ingrese el divisor: ");
            int divisor = input.nextInt();
            
            // Inicializar el contador de restas y el residuo
            int contadorRestas = 0;
            int residuo = dividendo;
            
            // Realizar la división con restas
            while (residuo >= divisor) {
                residuo -= divisor;
                contadorRestas++;
            }
            
            // Imprimir los resultados
            System.out.println("Cociente: " + contadorRestas);
            System.out.println("Residuo: " + residuo);
        }
}
