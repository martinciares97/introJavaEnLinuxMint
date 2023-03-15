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
public class ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase");
        String frase = sc.nextLine();
        
        codificarFrase(frase);
        
    }
    
    public static void codificarFrase(String frase) {
        int len_frase = frase.length();
        String fraseCodificada = "";
        
        for (int i = 0; i  < len_frase; i++) {
            switch(frase.substring(i, i +1)) {
                case "a":
                    fraseCodificada += "@";
                    break;
                case "e":
                    fraseCodificada += "#";
                    break;
                case "i":
                    fraseCodificada += "$";
                    break;
                case "o":
                    fraseCodificada += "%";
                    break;
                case "u":
                    fraseCodificada += "*";
                    break;
                default:
                    fraseCodificada += frase.substring(i, i +1);
                    
            }
        }
        
        System.out.println(fraseCodificada);
    }
    
}
/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
aeiou
@#$%*
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa:
Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/