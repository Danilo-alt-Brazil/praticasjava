/******************************************************************************
Vetores
danilio brazil
Faça um programa que copie o conteúdo de um vetor em um segundo vetor.


*******************************************************************************/

import java.util.Scanner;

public class trabalho16{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetorOri= new int[tamanho];
        int[] vetorCop = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorOri[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorCop[i] = vetorOri[i];
        }

        System.out.println("Vetor original:");
        for (int valor : vetorOri) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor copiado:");
        for (int valor : vetorCop) {
            System.out.print(valor + " ");
        }

        System.out.println();
        scanner.close();
    }
}