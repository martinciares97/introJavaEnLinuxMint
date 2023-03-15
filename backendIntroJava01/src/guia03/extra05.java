/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia03;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author cuni
 */
public class extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la obra social del socio");
        String clase = toUpperCase(leer.next());
        
        System.out.println("Ingrese el costo del servicio");
        double costo_real = leer.nextDouble();
        
        double descuento = 0;
        
        switch(clase) {
            case "A":
                descuento = -0.50;
                break;
            case "B":
                descuento = -0.35;
                break;
            case "C":
                System.out.println("Esta clase no tiene descuento");
                break;
            
        }
        
        double importe = costo_real + (costo_real * descuento);
        
        System.out.println("valor real que represente el costo del tratamiento: "
                + costo_real + "\n"
                + "el precio en efectivo con descuento aplicado: " + importe);
    }
    
}
