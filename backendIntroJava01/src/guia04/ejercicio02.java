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
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas que desea validar");
        int cant_personas = sc.nextInt();

        imprimirDatos(cant_personas, sc);

    }

    public static void imprimirDatos(int cant_personas, Scanner sc) {
        String nombre, respuesta;
        int edad;
        boolean flag_entry = true;

        while (flag_entry) {
            for (int i = 0; i < cant_personas; i++) {
                flag_entry = false;

                System.out.println("Nombre: ");
                nombre = sc.next();

                System.out.println("Edad: ");
                edad = sc.nextInt();

                if (edad < 18) {
                    System.out.println(nombre + " es menor de edad");
                } else {
                    System.out.println(nombre + " es mayor de edad");
                }

                if (i < cant_personas -1) {
                    do {
                    System.out.println("Quiere seguir mostrando personas? Si/No");
                    respuesta = sc.next();
                    } while(!"Si".equals(respuesta) && !"No".equals(respuesta));
                    
                    if ("No".equals(respuesta)) {
                        break;
                    }
                }

            }
        }

    }
}
/*
2. Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
