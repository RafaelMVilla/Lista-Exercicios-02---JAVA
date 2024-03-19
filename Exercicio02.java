
/*
Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero.
 */

public class Exercicio02 {
    
    public static void executar(){
        
        int contador = Prompt.lerInteiro("Digite a quantidade de números que deseja: ");
        
        double[] num = new double[contador];

        for (int i = 0; i < contador; i++) {
            
            num[i] = Prompt.lerDecimal("Digite o número: ");
        }

        for (int i = 0; i < contador; i++) {
            
            if (num[i] < 0) {
                
                Prompt.imprimir("Seu número é negativo: " + num[i]);
            } else if (num[i] == 0) {
                Prompt.imprimir("Seu número é igual a zero: " + num[i]);
            } else {
                Prompt.imprimir("Seu número é positivo: " + num[i]);
            }
        }

        

    }
}
