/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo.
 * Data: 16/04
 */

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva um número ");
        int n1 = teclado.nextInt();
        teclado.close();

        //saída
        if(n1>=0){
            System.out.print("o número é positivo ");
        } else {
            System.out.print("o número é negativo ");
        }
        if(n1 % 2  == 0){
            System.out.print ("e par");
        } else{
            System.out.print("e impar");
        }



    }
    
}
