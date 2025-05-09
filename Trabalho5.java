/*2.5_Faça um programa que:
Leia o nome;
Leia o sobrenome;
Concatene o nome com o sobrenome;
Apresente o nome completo.
 */
package trabalho5;

import java.util.Scanner;

public class Trabalho5 {

    
    public static void main(String[] args) {
        { 
       
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite o nome: ");
       
            String nome = scanner.nextLine();
            
            System.out.print("Digite o sobrenome: ");
            
            String sobrenome = scanner.nextLine();
       
            String nomeCompleto = nome + " " + sobrenome;
      
            System.out.println("Nome completo: " + nomeCompleto);
            scanner.close();
   
        
        }

    }

}