/*2.6_Faça um programa que:
Leia um número inteiro;
Leia um segundo número inteiro;
Efetue a adição dos dois valores;
Apresente o valor calculado.
 */
package trabalho6;

import java.util.Scanner;

public class Trabalho6 {

    public static void main(String[] args) {
      {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome completo: " + nomeCompleto);
        scanner.close();
 
        
   
        }
    }
}
