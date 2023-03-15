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
public class extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int A = 1, B = 2, C = 3, D = 4, aux;
        
        System.out.println("Valores iniciales: \n" +
"Variable A: "+ A +"\n" +
"Variable B: "+ B +"\n" +
"Variable C: "+ C +"\n" +
"Variable D: "+ D);
        
        
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        
        
        
        System.out.println("Valores finales: \n" +
"Variable A: "+ A +"\n" +
"Variable B: "+ B +"\n" +
"Variable C: "+ C +"\n" +
"Variable D: "+ D);
    }
    
}
/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/