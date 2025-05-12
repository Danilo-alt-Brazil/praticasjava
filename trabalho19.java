/******************************************************************************
Matrizes
danilo brazil
Faça um programa para ler e imprimir uma matriz 2 × 4 de números inteiros.

*******************************************************************************/
import java.util.Scanner;

public class trabalho19{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][4];

        System.out.println("Digite os elementos da matriz 2x4:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
