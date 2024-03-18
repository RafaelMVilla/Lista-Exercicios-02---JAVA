
/*
Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule a média destes valores em um outro vetor, e depois apresente na tela quais valores que são menores, iguais ou superiores à média.
 */

public class Exercicio01 {
    
    public static void executar(){

        double[] num = new double[5];
        double soma = 0.0;

        //Leitura de valores e realiza a soma numa variavel.
        for (int i = 0; i < 5; i++) {

            num[i] = Prompt.lerDecimal("Digite um número: ");
            soma += num[i];
        }

        //Realiza o caluclo e impressão da média.
        double media = soma / 5;
        Prompt.imprimir("----------------");
        Prompt.imprimir("Média: " + media);
        Prompt.imprimir("----------------");

        for (int i = 0; i < 5; i++) {
            
            if (num[i] < media) {
                Prompt.imprimir("Menor: " + num[i]);
            } else if (num[i] == media) {
                 Prompt.imprimir("Igual: " + num[i]);
            } else {
                Prompt.imprimir("Maior: " + num[i]);
            }
        }
    }
}
