import java.util.Scanner;

/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
 * Data: 30/04
 */

public class exercicio16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("digite um número ");
        numero = teclado.nextInt();

        while (numero >= 0){
            System.out.println("digite um número ");
            numero = teclado.nextInt();
        }
        teclado.close();


    }
}
