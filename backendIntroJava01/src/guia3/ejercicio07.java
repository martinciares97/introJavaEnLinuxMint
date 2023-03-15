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
public class ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contCorrectas = 0;
        int contIncorrectas = 0;
        
        do {
            System.out.println("Ingrese una cadena de texto");
            cadena = leer.nextLine();
            
            int len_cadena = cadena.length();
            
            
            String primerCaracter = cadena.substring(0, 1);
            String ultimoCaracter = cadena.substring(len_cadena -1, len_cadena);
            
            if(len_cadena > 5) {
                System.out.println("Cadena con demasiados caracteres ");
                contIncorrectas ++;
            } else {
                if(!"X".equals(primerCaracter) || !"0".equals(ultimoCaracter)) {
                    System.out.println("Cadena incorrecta");
                    contIncorrectas ++;
                } else {
                    System.out.println("Cadena correcta");
                    contCorrectas ++;
                }
            }
        } while(!"&&&&&".equals(cadena));
        System.out.println(contCorrectas);
        System.out.println(contIncorrectas);
        
    }
    
}
/*
7. Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: 

tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X 
y el último tiene que ser un O.

Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java Substring(), Length(), equals().
*/