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
public class extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digito1 = 0, digito2 = 0, digito3 = 0;
        System.out.println(digito1 + "-" + digito2 + "-" + digito3);

        while (digito1 != 9 || digito2 != 9 || digito3 != 9) {

            if (digito3 < 9) {
                digito3++;
            } else {
                digito3 = 0;
                if (digito3 == 0) {
                    if (digito2 < 9) {
                        digito2++;
                    } else {
                        digito2 = 0;
                        if (digito2 == 0) {
                            digito1++;
                        }
                    }
                }
            }
            System.out.println(digito1 + "-" + digito2 + "-" + digito3);
        }
    }
}
/*
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
