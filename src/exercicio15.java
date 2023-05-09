/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que preencha com zeros todas as posições de
uma matriz com 10 linha e 10 colunas
 * Data: 30/04
 */

public class exercicio15 {
    public static void main(String[] args) {
        
        int matriz[][] = new int [10][10];

        System.out.println("matriz preenchida com zeros:");

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = 0;
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println("");
        }
        
    }
}
