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
public class extra07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidad, acumulador = 0, num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double promedio;

        System.out.println("Ingrese la cantidad de numeros que desea verificar");
        cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            boolean flag_entry = true;
            
            while (flag_entry) {
                System.out.println("Ingrese un numero");
                num = leer.nextInt();
                
                if(i == 0) {
                    max = num;
                    min = num;
                }
                
                if (num <= 0) {
                    System.out.println("El numero ingresado no se encuentra en el "
                            + "rango solicitado, ingrese un numero nuevamente");
                } else {
                    flag_entry = false;
                    acumulador += num;

                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
            }
        }
        promedio = (double)acumulador / cantidad;

        System.out.println("INFORME FINAL\n"
                + "Valor maximo: " + max + "\n"
                + "Valor minimo: " + min + "\n"
                + "Promedio de los " + cantidad + " numeros ingresados: " 
                + promedio);
    }
}
/*
7. Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”
 */
