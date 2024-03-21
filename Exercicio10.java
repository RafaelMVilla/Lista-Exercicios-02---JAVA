
/*
Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim por diante.
 */

public class Exercicio10 {
    
    public static void executar(){

        int tamanho = 5;
        int[] num = new int[tamanho];
        int[] Inverter = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            num[i] = Prompt.lerInteiro("Digite uma sequência de números para inverter:");

            int numero = num[i];
            while (numero > 0) {

                int digito = numero % 10;
                Inverter[i] = Inverter[i] * 10 + digito;
                numero /= 10;
            }
        } 

        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir("--------------------");
            Prompt.imprimir("Número digitado: " + num[i] + "\nNúmero Invertido: " + Inverter[i]);
        }
        
            Prompt.imprimir("--------------------");

    }
}
