/******************************************************************************
Strings
danilo brazil
Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o
nome do usuário de trás para frente utilizando somente letras maiúsculas. Dica: 
lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou 
minúsculas.

*******************************************************************************/
import java.util.Scanner;

public class trabalho14{
    
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String nomeMaiusculo = nome.toUpperCase();

        String nomeInvertido = new StringBuilder(nomeMaiusculo).reverse().toString();
      
        System.out.println("Seu nome de trás para frente é: " + nomeInvertido);
        scanner.close();
    }
}