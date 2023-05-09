/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que leia dois números A e B e imprima o maior deles.
 * Data: 16/04
 */

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){

        //variaveis
        double a,b;

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva o numéro A ");
        a = teclado.nextDouble();        
        System.out.println("escreva o numéro B");
        b = teclado.nextDouble();
        teclado.close();

        //saída           
        if(a>b){
            System.out.println("o número A é o maior número " + a);
        }else{
            System.out.println(" o número B é o maior número " + b);           
        }        
    }    
}
