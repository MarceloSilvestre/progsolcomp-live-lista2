/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que preencha com zeros todas as posições de
um vetor de tamanho 50 
 * Data: 30/04
 */

public class exercicio14 {
    public static void main(String[] args) {
       
       int vetor[] = new int[50];

       System.out.println("Vetor preenchido com zeros:");
       
       for (int i = 0; i < vetor.length; i++) {
          vetor[i] = 0;
          System.out.print(vetor[i] + " ");
       }

    }
 }