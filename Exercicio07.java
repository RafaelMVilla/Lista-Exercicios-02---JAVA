
/*
Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem coincidir.
 */

public class Exercicio07 {
    
    public static void executar(){

        int contador = 5;
        String[] elemento1 = new String[contador];
        String[] elemento2 = new String[contador];

        for (int i = 0; i < contador; i++) {
            
            elemento1[i] = Prompt.lerLinha("Digite seu primeiro elemento para comparação: ");
            elemento2[i] = Prompt.lerLinha("Digite seu segundo elemento para comparação: ");
            Prompt.imprimir("----------------------------------------"); 

        }

        for (int i = 0; i < contador; i++) {
            
            if (elemento1[i].equals(elemento2[i])) { 

                Prompt.imprimir("Os elementos: " + elemento1[i] + " e " + elemento2[i] + ": São iguais.");
                Prompt.imprimir("----------------------------------------");  

            }else {
                Prompt.imprimir("Os elementos: " + elemento1[i] + " e " + elemento2[i] + ": São diferentes.");
                Prompt.imprimir("----------------------------------------"); 
            } 
        }         
    }
}
