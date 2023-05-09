/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação. 
 * Data: 16/04
 */

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        //variaveis
        int mes;

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe um número entre 1 e 12 pra saber qual é o mês e a estação do ano ");
        mes = teclado.nextInt();
        teclado.close();

        //saida e processamento
        switch(mes){
            case 1: System.out.println("janeiro - verão");
            break;
            case 2: System.out.println("fevereiro - verão");
            break;
            case 3: System.out.println("março - verão/outono");
            break;
            case 4: System.out.println("abril - outono");
            break;
            case 5: System.out.println("maio - outono");
            break;
            case 6: System.out.println("junho - outono/inverno");
            break;
            case 7: System.out.println("julho - inverno");
            break;
            case 8: System.out.println("agosto - inverno");
            break;
            case 9: System.out.println("setembro - inverno/primavera");
            break;
            case 10: System.out.println("outubro - primavera");
            break;
            case 11: System.out.println("novembro - primavera");
            break;
            case 12: System.out.println("dezembro - primavera/verão");
            break;
            default: System.out.println("esse número não é equivalente a um mês");
        }

        
    }
    
}
