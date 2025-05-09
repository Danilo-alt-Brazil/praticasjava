/* 2.2_Faça um programa que peça as 4 notas bimestrais e mostre a média.
 *
 */
package trabalho4;

import java.util.Scanner;


public class Trabalho4 {
    public static void main(String[] args) {
      { 
          Scanner scanner = new Scanner(System.in);

        double nt1, nt2, nt3, nt4, media;

        System.out.print("Digite a primeira nota: ");
        nt1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nt2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nt3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nt4 = scanner.nextDouble();

        media = (nt1 + nt2 + nt3 + nt4) / 4;
        
        System.out.println("A média das notas é: " + media);
        scanner.close();
    }
   }
 } 
        
        
  
    

