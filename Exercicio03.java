
/*
Faça um programa que leia em um vetor uma sequência finita de números digitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do primeiro vetor e depois apresente os valores deste vetor.
 */

public class Exercicio03 {
    
    public static void executar(){

        int contador = Prompt.lerInteiro("Digite a quantidade de números: ");

        double[] num = new double[contador];
        double[] calculo = new double[contador];

        for (int i = 0; i < contador; i++) {
            
           num[i] = Prompt.lerDecimal("Digite um número: ");

           
           calculo[i] = num[i] * 2;
        
        }

        for (int i = 0; i < contador; i++) {
            
            Prompt.imprimir("Número: " + num[i]);
            Prompt.imprimir("Número dobrado: " + calculo[i]);
        }
    }
}
