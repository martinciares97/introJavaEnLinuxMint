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
public class extra09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numA = 0, numB = 0;

        boolean flag_entry = true;

        while (flag_entry) {
            System.out.println("Ingrese dos numeros para realizar la division");
            numA = leer.nextInt();
            numB = leer.nextInt();

            if (numA < 1 || numB < 1) {
                System.out.println("Numero ingresado incorrecto");
            } else {
                System.out.println("Numero ingresado correctamente");
                flag_entry = false;
            }
        }

        realizarDivision(numA, numB);

    }

    public static void realizarDivision(int dividendo, int divisor) {
        int cociente = 0, residuo = 0;

        do {
            dividendo = dividendo - divisor;
            residuo = dividendo;
            cociente++;

        } while (residuo > divisor);

        System.out.println("divisor " + divisor + "\n"
                + "residuo " + residuo + "\n"
                + "cociente " + cociente);
    }
}
/*
9. Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37una resta realizada
37 – 13 = 24dos restas realizadas
24 – 13 = 11tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
