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
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();

        verificarNumPrimo(num);
    }

    public static void verificarNumPrimo(int num) {
        int cont = 0;

        if (num >= 2) {
            for (int i = 2; i < num + 1; i++) {
                if (num % i == 0) {
                    cont++;
                }
            }
            if (cont > 1) {
                System.out.println("El numero no es primo");
            } else {
                System.out.println("El numero es primo");
            }
        }
    }
}
/*
4. Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
*/
