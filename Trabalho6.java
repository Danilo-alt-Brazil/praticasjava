/*Estrutura de decisão
 *Danilo Brazil 
 *Faça um programa que receba como entrada três valores e os imprima em ordem crescente.
 * 
 */
package trabalho6;

import java.util.Arrays;
import java.util.Scanner;



public class Trabalho6 {

    
    
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double c = scanner.nextDouble();

      
        double[] valores = {a, b, c};

      
        Arrays.sort(valores);

        
        System.out.println("Valores em ordem crescente:");
        for (double valor : valores) {
            System.out.println(valor);
        }

        scanner.close();
    }
}

        
        
        
        
        
    
    

