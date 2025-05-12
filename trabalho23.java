/******************************************************************************
Funções
danilo brazil
Faça um programa com duas funções, uma que recebe uma temperatura em Fahrenheit
e retorna em Celcius e outra que faz o inverso. Lembrando que as fórmulas
são ℃ = (℉ - 32) ÷ 1,8 e ℉ = ℃ × 1,8 + 32.
*******************************************************************************/
import java.util.Scanner;

public class trabalho23{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Digite a temperatura em graus Celsius: ");
         double celsius = scanner.nextDouble();
         
         
         double fahrenheit = (9 * celsius + 160) / 5;
         
         
         System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + " ℉");
            
        }
        
    }
}



  
  
