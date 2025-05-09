/*Estrutura de repetição
 * Danilo Brazil
 * 
 */
package trabalho9;

 import java.util.Scanner;
import java.text.DecimalFormat;

public class Trabalho9 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

        System.out.print("Digite o valor depositado na poupança: ");
        double valor = scanner.nextDouble();

        double taxa = 0.005;

        System.out.println("\nRendimento mês a mês:");
        for (int mes = 1; mes <= 12; mes++) {
            valor += valor * taxa;
            System.out.println("Mês " + mes + ": " + formato.format(valor));
        }

        scanner.close();
    }
}

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
