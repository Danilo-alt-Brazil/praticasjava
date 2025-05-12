/* Lógica
 * Danilo Brazil
 *10_Uma pessoa lê um livro de 100 páginas em 6 dias. Em quantos dias essa pessoa lê um livro de 150 páginas?
 */
package trabalho2;


public class Trabalho2 {

    public static void main(String[] args) {
     int pglidas = 100;
     int dias = 6;
     int pgdonovolivro = 150;
     int diasparanovolivro = (pgdonovolivro * dias) /pglidas;
     System.out.println("Essa pessoa levara " + diasparanovolivro + "dias para ler o livro de 150 paginas.");
        
 
  }
    
}
