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
public class ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean flag_entry = true;
        int option;
        String salir = null;
                
        do {
            System.out.println("Ingrese operador A y operador B");
            System.out.println("Operador A");
            int operadorA = leer.nextInt();
            System.out.println("Operador B");
            int operadorB = leer.nextInt();
            
            System.out.println("MENU\n" +
"1 - SUMAR\n" +
"2 - RESTAR\n" +
"3 - MULTIPLICAR\n" +
"4 - DIVIDIR\n" +
"5 - SALIR\n" +
"\n" +
"ELIJA UNA OPCION: ");
            option = leer.nextInt();
            
            switch(option) {
                case 1:
                    int suma = operadorA + operadorB;
                    System.out.println(suma);
                    break;
                case 2:
                    int resta = operadorA - operadorB;
                    System.out.println(resta);
                    break;
                case 3:
                    int mult = operadorA * operadorB;
                    System.out.println(mult);
                    break;
                case 4:
                    float div = (float)operadorA / (float)operadorB;
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa\n" +
"(S/N)?");
                    salir = leer.next();
                    if("S".equals(salir)) {
                        System.out.println("Cerrando sesion");
                    }
                    
            } 
        } while(option != 5 || !"S".equals(salir));
   }
}
/*
6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

MENU
1 - SUMAR
2 - RESTAR
3 - MULTIPLICAR
4 - DIVIDIR
5 - SALIR

ELIJA UNA OPCION: 
*/