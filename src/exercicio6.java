/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
 * Data: 16/04
 */

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        //variaveis
        double nota;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva sua nota ");
        nota = teclado.nextDouble();
        teclado.close();

        //processamento e saída
        if(nota<0 || nota > 100){
            System.out.println("digite um número entre 0 e 100");
        }else if (nota <=49){
            System.out.println("nota conceito insuficiente");
        }else if (nota <=64){
            System.out.println("nota conceito regular");
        }else if(nota <= 84){
            System.out.println("nota conceito boa");
        }else if(nota <= 100){
            System.out.println("nota conceito ótima");
        }       
    }
}
