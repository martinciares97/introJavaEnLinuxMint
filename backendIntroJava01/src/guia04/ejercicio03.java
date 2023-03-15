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
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros_ingresados = sc.nextDouble();
        
        System.out.println("Ingrese el tipo de cambio");
        String tipo_moneda = sc.next();
        
        convertirMoneda(euros_ingresados, tipo_moneda);
    }
    public static void convertirMoneda(double euros_ingresados, String tipo_moneda) {
        
        switch(tipo_moneda) {
            case "Libras":
                double libras = euros_ingresados * 0.86;
                System.out.println(euros_ingresados+" euros equivalen a "+ libras +" libras");
                break;
            case "Dolares":
                double dolares = euros_ingresados * 1.28611;
                System.out.println(euros_ingresados+" euros equivalen a "+ dolares +" dolares");
                break;
            case "Yenes":
                double yenes = euros_ingresados * 129.852;
                System.out.println(euros_ingresados+" euros equivalen a "+ yenes +" yenes");
                break;
        }
        
    }
}
/*
3. Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i.
ii.
iii.
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/