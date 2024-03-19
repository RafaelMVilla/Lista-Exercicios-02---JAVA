
/*
Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor com 5 pesos e calcule a média ponderada do aluno.


Média ponderada =  (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)
                   ---------------------------------------------------
                                peso1 + peso2 + peso3
 */

public class Exercicio06 {
    
    public static void executar(){

        int contador = Prompt.lerInteiro("Digite a quantidade de notas com peso: ");

        double[] nota = new double[contador];
        double[] peso = new double[contador];
        
        for (int i = 0; i < contador; i++) {
            
            nota[i] = Prompt.lerDecimal("Digite a sua nota: ");
        }

        for (int i = 0; i < contador; i++) {
            
            peso[i] = Prompt.lerDecimal("Digite o peso: ");
        }

        double calculolonumerador = 0;
        double somapeso = 0;

        for (int i = 0; i < contador; i++) {
            
            calculolonumerador += (nota[i] * peso[i]);
            somapeso += peso[i];
        }
        
        double mediapond = calculolonumerador / somapeso;

        Prompt.imprimir("A média ponderada do aluno é: " + mediapond);
    }
}
