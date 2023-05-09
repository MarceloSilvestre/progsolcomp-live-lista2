import java.util.Scanner;

/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
 * Data: 30/04
 */

public class exercicio18 {
    public static void main(String[] args) {

        //variaveis
        double numero;
        double fatorial = 1;
        int i;
        
        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o número que você quer saber o fatorial ");
        numero = teclado.nextDouble();
        teclado.close();

        for (i = 1; i <= numero; i = i + 1) {
            fatorial = fatorial * i;             
        }
        System.out.println("o fatorial é ");
        System.out.println(fatorial);
    }
}
