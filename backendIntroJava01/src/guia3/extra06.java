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
public class extra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas que desea promediar");
        int cantidad = leer.nextInt();
        int contador_160 = 0;
        double acumulador_160 = 0, acumulador_general = 0;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la altura de la persona");
            double altura = leer.nextDouble();
            
            acumulador_general += altura;
            
            if(altura < 1.60) {
                acumulador_160 += altura;
                contador_160 ++;
            }
        }
        
        double promedio_general = acumulador_general / cantidad;
        
        double promedio_160 = acumulador_160 / contador_160;
        
        System.out.println("La altura promedio de las " + cantidad + " personas "
                + "registradas es de " + promedio_general + "\n"
                        + "Y la altura promedio de las personas menores a 1.60 "
                        + "es de " + promedio_160);
    }
}
/*
6. Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
*/