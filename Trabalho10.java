/*
 * 
 * 
 */
package trabalho10;

import java.util.Scanner;

public class Trabalho10 {

    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int espacos = 0;
        int vogais = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            if (c == ' ') {
                espacos++;
                
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vogais++;
            }
        }

       
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de vogais: " + vogais);
        scanner.close();
    }
}

        
        
        
        
        
        
        
        
        
        

