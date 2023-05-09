import java.util.Scanner;

/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
 * Data: 30/04
 */

public class exercicio20 {
    public static void main(String[] args) {

        double pessoas,maxpessoas,pesoelevador,peso;

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o peso suportado pelo elevador");
        pesoelevador = teclado.nextDouble();
        System.out.println("informe o número maximo de pessoas permitidas dentro do elevador");
        maxpessoas = teclado.nextDouble();

        pessoas = 0;
        peso = 0;
        do {
            System.out.println("informe o peso das pessoas do elevador");
            peso = peso + teclado.nextDouble();
             
            pessoas = pessoas + 1;
        } while (pessoas <=  maxpessoas && peso <= pesoelevador);
        teclado.close();

        System.out.println("carga maxima ou limite de pessoas atingida, a ultima pessoa que entrou no elevador deve sair!");       
    }
}
