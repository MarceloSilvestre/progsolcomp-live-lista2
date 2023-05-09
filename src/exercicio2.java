import java.util.Scanner;

/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
 * Data: 16/04
 */

public class exercicio2 {
    public static void main(String[] args) {

        //variaveis
        double a,b,c;

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva o valor A");
        a = teclado.nextDouble();
        System.out.println("escreva o valor B");
        b = teclado.nextDouble();
        System.out.println("escreva o valor C");
        c = teclado.nextDouble();
        System.out.println(" ");
        teclado.close();

        //processamento / saída
        if(a<=b && b<=c){
            System.out.println(a+"\n"+b+"\n"+c);//ok
        }else if(a<=c && c<=b){
            System.out.println(a+"\n"+c+"\n"+b);
        }else if(b<=a && a<=c){
            System.out.println(b+"\n"+a+"\n"+c);
        }else if(b<=c && c<=a){
            System.out.println(b+"\n"+c+"\n"+a);
        }else if(c<=a && a<=b){
            System.out.println(c+"\n"+a+"\n"+b);
        }else if(c<=b && b<=a){
            System.out.println(c+"\n"+b+"\n"+a);
        }     
    }
}
