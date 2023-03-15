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
public class extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int num = sc.nextInt();
        
        int cont_digitos = 0;
        
        while(num != 0) {
            num = num /10;
            cont_digitos ++;
            
            System.out.println(num);
        }
        System.out.println("El numero se compone de " + cont_digitos + " digitos");
    }
    
}
/*
11. Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.

System.out.println("Ingrese un numero entero");
        String num = sc.next();
        
        int len_num = num.length();
        
        System.out.println(len_num);
*/