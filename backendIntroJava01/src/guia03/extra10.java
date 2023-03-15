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
public class extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numA = (int) (Math.random() * 10) + 1;
        System.out.println(numA);
        int numB = (int) (Math.random() * 10) + 1;
        System.out.println(numB);

        int resultado = multiplicarNumeros(numA, numB);
        boolean flag_entry = true;

        while (flag_entry) {
            System.out.println("Adivine el resultado de la multiplicacion");
            int respuesta = leer.nextInt();

            if (respuesta != resultado) {
                if (respuesta > resultado) {
                    System.out.println("Resultado incorrecto. Intente con un "
                            + "numero mas chico");
                } else {
                    System.out.println("Resultado incorrecto. Intente con un "
                            + "nuero mas grande");
                }
            } else {
                System.out.println("Resultado correcto");
                flag_entry = false;
            }

        }
    }

    public static int multiplicarNumeros(int numero1, int numero2) {

        int resultado = numero1 * numero2;

        return resultado;

    }

}
/*
10. Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/
