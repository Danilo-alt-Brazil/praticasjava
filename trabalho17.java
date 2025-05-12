/******************************************************************************
Vetores
danilo brazil
Faça um programa que some o conteúdo de dois vetores e armazene o resultado em
um terceiro vetor.

*******************************************************************************/

import java.util.Scanner;
public class trabalho17{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorSoma = new int[tamanho];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("\nVetor A:");
        for (int num : vetorA) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor B:");
        for (int num : vetorB) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor Soma:");
        for (int num : vetorSoma) {
            System.out.print(num + " ");
        }

        System.out.println();
        scanner.close();
    }
}