
/*
Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5. 

    Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140
 */

public class Exercicio11 {
    
    public static void executar(){

        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int resultado = 0;

        for (int i = 0; i < 5; i++) {
            
            num1[i] = Prompt.lerInteiro("Digite o número da primeira sequência: ");          

        }
        
        for (int j = 0; j < 5; j++) {
            
            num2[j] = Prompt.lerInteiro("Digite o número da segunda sequência: ");
            resultado = resultado + (num1[j] * num2[j]);
        }

        Prompt.imprimir("------------------------------------");
        Prompt.imprimir("Resultado do produto escalar é: " + resultado);
    }
}
