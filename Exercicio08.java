
/*
Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos de B.
 */

public class Exercicio08 {
    
    public static void executar(){

        String[] A = new String[5];
        String[] B = new String[5];
        String[] C = new String[5];

        for (int i = 0; i < 5; i++) {
            
            A[i] = Prompt.lerLinha("Digite algo para concatenar: ");
            B[i] = Prompt.lerLinha("Digite algo para concatenar: ");
            Prompt.imprimir("---------------------------------");

            C[i] = A[i] + B[i];

        }

        for (int i = 0; i < 5; i++) {
            Prompt.imprimir( "Primeiro Elemento: " + A[i] + "\nSegundo Elemento: " + B[i] + "\nResultado: " + C[i]);
            Prompt.imprimir("--------------------------------------");
        }

    }
}
