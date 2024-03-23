
/*
Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo valor lido só poderá ser maior que 5.
 */

public class Exercicio15 {
    
    public static void executar(){

        int Numdigitado = 1;
        int[] Num = new int[5];

        for (int i = 0; i < 5; i++) {
            
            while (true) {
                Num[i] = Prompt.lerInteiro("Digite um número: ");

                if (Num[i] > Numdigitado) {
                    Numdigitado = Num[i];
                    break;
                } else {
                    Prompt.imprimir("Erro! Digite Novamente: ");
                }
            }

        }

        Prompt.imprimir("--------------");
        Prompt.imprimir("Valores: ");
        

        for (int i = 0; i < 5; i++) {
        
            Prompt.imprimir(Num[i]);
        }
    }
}

