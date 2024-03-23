
/*
Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento na última posição do vetor. Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizado na tela.
 */

public class Exercicio14 {
    
    public static void executar(){

        int[] Valor = new int[5];
        int Maiornum = 0;

        for (int i = 0; i < 5; i++) {
            
            Valor[i] = Prompt.lerInteiro("Digite um número: ");
        
            if (Valor[i] > Maiornum) {
                
                Maiornum = Valor[i];
            }
        }

        Prompt.imprimir("--------------------------------");
        Prompt.imprimir("Vetor = {");
        for (int i = 0; i < 5; i++) {
            
            if (Valor[i] < Maiornum) {
                
                Prompt.imprimir( Valor[i] + ", ");
            }
            if (i == 4) {
                
                Prompt.imprimir(Maiornum + " }");
            }
        }

    }
}
