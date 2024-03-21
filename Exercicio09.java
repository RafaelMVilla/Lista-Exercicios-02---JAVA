
/*
Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:
a. Os elementos das posições pares de C são os elementos das posições pares de A;
b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;
 */


public class Exercicio09 {
    
    public static void executar(){

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        int contador = 0;

        contador = Prompt.lerInteiro("Digite a quantidade de números que deseja: ");

        for (int i = 0; i < contador; i++) {
            
            

            A[i] = Prompt.lerInteiro("Digite o dígito de A: ");

        }
        
        for (int i = 0; i < contador; i++) {

            B[i] = Prompt.lerInteiro("Digite o dígito de B: ");
        }

        for (int i = 1; i < contador; i +=2) {
            
            C[i] = A[i];
        }
        for (int i = 0; i < contador; i +=2) {
            
            C[i] = B[i];
        }

        Prompt.imprimir("-----------------------------");

        for (int j = 0; j < contador; j++) {
            
            Prompt.imprimir(C[j]);
        }
        
    }
}
