import java.util.Scanner;

/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
 * Data: 30/04
 */

public class exercicio19 {
    public static void main(String[] args) {

        //variaveis
        double volume,tempo;

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o volume do gás ");
        volume = teclado.nextDouble();
        teclado.close();

        //processamento
        tempo = 0;
        while(volume<=1000){
            volume = volume * 2;
            tempo = tempo + 1;
        }

        //saída
        System.out.printf("O tempo necessario pra o gás passar de 1000 centímetros cúbicos é %.0f segundos e o volume do gás será %.2f centímetros cúbicos",tempo,volume);
    }
}
