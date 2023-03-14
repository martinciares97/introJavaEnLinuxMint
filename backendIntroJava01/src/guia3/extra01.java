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
public class extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de minutos");
        int min_ingresados = leer.nextInt();
        
        int dias = min_ingresados / 1440;
        int horas = (min_ingresados - (dias * 1440))/60;
        
        System.out.println("los minutos ingresados son equivalentes a: \n"
                + dias + " dias, " + horas + " horas" );
        
    }
}
/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/