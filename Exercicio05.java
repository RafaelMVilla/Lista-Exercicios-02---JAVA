
/*
Elabore um programa que leia 5 números do teclado e os armazene em um vetor. Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes que o número n aparece no vetor.
 */

public class Exercicio05 {
    
    public static void executar(){

        double[] num = new double[5];
        int contador = 0;
        double n = Prompt.lerDecimal("Digite um número para comparação de quantidade: ");
        
        for (int i = 0; i < 5; i++) {
            
            num[i] = Prompt.lerDecimal("Digite um número");
            
            if (n == num[i]) {
                contador++;
            }
        }

        Prompt.imprimir("Seu número de comparação foi repetido: " + contador + " vezes.");
    }
}
