/******************************************************************************
Vetores
danilo brazil
Uma escola de samba recebeu como pontos pela alegoria os seguintes 5 valores 
inclusos no vetor Notas. Lembrando que a nota mais alta e a nota mais baixa são
descartadas. Faça um programa que calcule a média final do quesito.




*******************************************************************************/

import java.util.Scanner;

public class trabalho18{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        
        
        System.out.println("Digite as 5 notas dos jurados:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += notas[i];
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double somaFinal = soma - maior - menor;

        double mediaFinal = somaFinal / 3;
        System.out.printf("Média final (descartando a maior e a menor nota): %.2f\n",mediaFinal);
        scanner.close();
    }
}