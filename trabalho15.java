/******************************************************************************
String
danilo brazil
Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado
em uma variável inteira), imprima cada um dos seus dígitos por extenso.



*******************************************************************************/
import java.util.Scanner;

public class trabalho15{
	public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);

        String[] extenso = {
            "Zero", "Um", "Dois", "Três", "Quatro",
            "Cinco", "Seis", "Sete", "Oito", "Nove"
        };

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroStr = Integer.toString(Math.abs(numero));

        if (numero < 0) {
            System.out.print("Menos ");
        }

        for (int i = 0; i < numeroStr.length(); i++) {
            char digitoChar = numeroStr.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            System.out.print(extenso[digito] + " ");
        }

        System.out.println(); 
        scanner.close();
	    
	}
    
}  
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	