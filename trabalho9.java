/******************************************************************************
Estrutura de decisão
danilo brazil
Faça um programa que receba como entrada três valores e os imprima em ordem crescente.
*******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class trabalho9{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int[] numeros = { num1, num2, num3 };

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
