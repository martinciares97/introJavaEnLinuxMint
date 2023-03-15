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
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero A y B");
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        resolverOperaciones(numA, numB, sc);
    }

    public static void resolverOperaciones(int numero1, int numero2, Scanner sc) {
        boolean flag_entry = true;
        int option;

        while (flag_entry) {
            do {
                System.out.println("MENU\n"
                        + "1- SUMA\n"
                        + "2- RESTA\n"
                        + "3- MULTIPLICACION\n"
                        + "4- DIVISION\n"
                        + "5- SALIR\n"
                        + "Seleccione una de las opciones: ");

                option = sc.nextInt();
            } while (option < 1 || option > 5);

            switch (option) {
                case 1:
                    int suma = numero1 + numero2;
                    System.out.println(suma);
                    break;
                case 2:
                    int resta = numero1 - numero2;
                    System.out.println(resta);
                    break;
                case 3:
                    int mult = numero1 * numero2;
                    System.out.println(mult);
                    break;
                case 4:
                    double div = (double) numero1 / (double) numero2;
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("Cerrando sesión");
                    flag_entry = false;
                    break;
            }
        }

    }
}
/*
1. Crea una aplicación que: 
le pida dos números al usuario y este pueda elegir entre sumar, restar, 
multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben 
devolver sus resultados para imprimirlos en el main.

 */
