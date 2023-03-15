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
public class extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acum_edad = 0;
        int cant_hijos = 0;
        int acum_hijos = 0;

        System.out.println("Ingrese la cantidad de familias");
        int cant_familias = sc.nextInt();

        for (int i = 0; i < cant_familias; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene la familia");
            cant_hijos = sc.nextInt();
            acum_hijos += cant_hijos;

            for (int j = 0; j < cant_hijos; j++) {
                System.out.println("Ingrese la edad de su hijo/a");
                acum_edad += sc.nextInt();
            }
        }
        double promedio = (double) acum_edad / acum_hijos;

        System.out.println("La media de edad de los hijos de todas las familias"
                + "es de " + promedio);
    }
}
/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
