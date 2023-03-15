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
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean flag_entry = true;
        
        while(flag_entry == true) {
            System.out.println("Ingrese una frase o palabra de 8 caracteres");
            String frase = leer.nextLine();
            
            int len_frase = frase.length();
            
            if(len_frase != 8) {
                System.out.println("INCORRECTO");
            } else {
                System.out.println("CORRECTO");
                flag_entry = false;
            }
        }
    }
    
}
/*
3. Realizar un programa que solo permita introducir frases o palabras
de 8 caracteres de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
*/