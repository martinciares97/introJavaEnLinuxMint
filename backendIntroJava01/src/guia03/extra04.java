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
public class extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 10");
        int num = leer.nextInt();
        String num_romano = "";

        do {

            if (num >= 10) {
                num_romano += "X";
                num -= 10;
            } else if (num >= 9) {
                num_romano += "IX";
                num -= 9;
            } else if (num >= 5) {
                num_romano += "V";
                num -= 5;
            } else if (num >= 4) {
                num_romano += "IV";
                num -= 4;
            } else {
                int aux = num;

                for (int i = 0; i < aux; i++) {
                    num_romano += "I";
                    num--;
                }
            }

        } while (num != 0);

        System.out.println(num_romano);
    }

}
/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
