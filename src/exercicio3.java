/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
 * Data: 08/05
 */

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        double a,b;
        
        //entradas
        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva um número");
        a = teclado.nextDouble();
        System.out.println("escreva outro número");
        b = teclado.nextDouble();
        teclado.close();

        //processamento / saída
        
        if (a % b == 0 || b % a == 0 ){
            System.out.println("São multiplos");
        } else{
            System.out.println("Não são multiplos");
        }
        
    }
}
