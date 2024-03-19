
/*
Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n qualquer, depois mostre na tela o índice dos elementos que são inferiores a n.
 */

public class Exercicio04 {
    
    public static void executar(){

        int contador = Prompt.lerInteiro("Digite a quantidade de números: ");

        double n = Prompt.lerDecimal("Digite um número para ser o parâmetro: ");

        double[] num = new double[contador];

        for (int i = 0; i < contador; i++) {
            
             num[i] = Prompt.lerDecimal("Digite o número: ");
        }

        for (int i = 0; i < num.length; i++) {
            
            if (num[i] < n) {
                
                Prompt.imprimir("-------------------------------");
                Prompt.imprimir("Número inferior ao parâmetro:");
                Prompt.imprimir("Parâmetro:" + n);
                Prompt.imprimir("Número:" + num[i]);
            }   
        }
        Prompt.imprimir("-------------------------------");
    }
}
