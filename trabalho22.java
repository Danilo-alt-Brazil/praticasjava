/******************************************************************************
Funções
danilo brazil
Crie uma função que necessite de três argumentos, e que forneça a soma desses 
três argumentos.
*******************************************************************************/


public class trabalho22{

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        int resultado = somar(10, 20, 30);
        System.out.println("A soma é: " + resultado);
    }
}
