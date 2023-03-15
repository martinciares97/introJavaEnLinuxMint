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
public class extra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int ultimo_digito, contador = 0, cont_par = 0, cont_impar = 0;

        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            contador++;

            ultimo_digito = num % 10;

            if (num <= 0) {
                System.out.println("El numero ingresado es menor que 1");
            } else {
                if (num % 2 == 0) {
                    System.out.println("El numero " + num + " es par");
                    cont_par++;
                } else {
                    System.out.println("El numero " + num + " es impar");
                    cont_impar++;
                }
            }
        } while (ultimo_digito != 0 && ultimo_digito != 5);

        System.out.println("Cantidad de numeros leidos: " + contador + "\n"
                + "Cantidad de numeros pares: " + cont_par + "\n"
                + "Cantidad de numeros impares: " + cont_impar);

    }
}
/*
8. Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, 
la cantidad de números pares 
y la cantidad de números impares.
Al igual que en el ejercicio anterior 
los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
 */
