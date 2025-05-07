package exemplo4;
import java.util.Scanner;

//imprima dois numeros e diga o maior entre eles
//Guilherme Soares
public class Exemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        int y;
        System.out.printf("Digite um valor: ");
  x = ler.nextInt(); 
  
        System.out.printf("Digite um valor: ");
  y = ler.nextInt(); 
            
       if (x > y) {
    System.out.println(x);
} else {
    System.out.println(y);
}
        
        
        
    }
    
}
