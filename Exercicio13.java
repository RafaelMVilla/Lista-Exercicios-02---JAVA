
/*
Elabore um algoritmo que receba um número n e retorne um vetor com os n primeiros termos da sequência de Fibonacci. 
Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 13, 21}.
 */

public class Exercicio13 {
    
    public static void executar(){

        int n = Prompt.lerInteiro("Digite o quantidade de números que deseja ver da sequência de Fibonacci: ");

        int[] vetor = new int[n];

        vetor[0] = 1;
        vetor[1] = 1;

        for (int i = 2; i < n; i++) {
            
            vetor[i] = vetor[i - 1] + vetor[i - 2];

        }

        Prompt.imprimir("Seuquência = " + n + "\nVetor = {");

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                Prompt.imprimir(",");
            }
            Prompt.imprimir(vetor[i]);
        }
        Prompt.imprimir("}.");
    }
}
