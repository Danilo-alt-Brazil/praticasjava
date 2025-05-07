package Exemplo5;
import java.util.Scanner;
//Guilherme Soares
//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia,
//e R$ 1,00 se forem compradas pelo menos 12 unidades. Escreva um programa 
//que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

public class Exemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x;
        
        System.out.printf("Quantas maças voce quer? ");
             x = ler.nextInt(); 
  
            
       if (x > 11) {
           System.out.println(x*1.00);
       } else {
           System.out.println(x*1.30);
       }
        
        
        
    }
    
}
