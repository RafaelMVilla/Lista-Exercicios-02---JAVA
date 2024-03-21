
/*
Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:
a. Os elementos das posições pares de C são os elementos das posições pares de A;
b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;
 */

import java.security.AlgorithmParameterGeneratorSpi;

public class Exercicio09 {
    
    public static void executar(){

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];


        for (int i = 0; i < 5; i++) {
            
            A[i] = Prompt.lerInteiro("Digite um número: ");
            B[i] = Prompt.lerInteiro("Digite um número: ");

        } 
    }
}
