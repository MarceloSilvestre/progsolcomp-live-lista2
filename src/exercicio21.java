/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
 * Data: 08/05
 */

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        System.out.println("digite um número");
        int numero = teclado.nextInt();
        teclado.close();

        for(int i = 1; i<= numero; i++)  {
            System.out.print(i + " x 1 = " + i*1 + " / ");
            System.out.print(i + " x 2 = " + i*2 + " / ");
            System.out.print(i + " x 3 = " + i*3 + " / ");
            System.out.print(i + " x 4 = " + i*4 + " / ");
            System.out.print(i + " x 5 = " + i*5 + " / ");
            System.out.print(i + " x 6 = " + i*6 + " / ");
            System.out.print(i + " x 7 = " + i*7 + " / ");
            System.out.print(i + " x 8 = " + i*8 + " / ");
            System.out.print(i + " x 9 = " + i*9 + " / ");
            System.out.print(i + " x 10 = " + i*10 + " ");
            System.out.println(" ");
            System.out.println(" ");
        }     

    }
}
