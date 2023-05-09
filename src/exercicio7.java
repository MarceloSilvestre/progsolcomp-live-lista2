/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
 * Data: 16/04
 */

 import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        //variaveis
        int dias;
        double valortotal;

        //entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o tempo (em dias) passado no hotel ");
        dias = teclado.nextInt();
        teclado.close();

        //processamento e saída
        if (dias > 15){
            valortotal = 60 * dias + 5.50 * dias;
            System.out.println("o valor a pagar é R$ " + valortotal);
        } else if(dias == 15){
            valortotal = 60 * dias + 6 * dias;
            System.out.println("o valor a pagar é R$ " + valortotal);
        } else if(dias >= 1  && dias < 15){
            valortotal = 60 * dias + 8 * dias;
            System.out.println("o valor a pagar é R$ " + valortotal);
        } else if(dias <= 0){
            System.out.println("o tempo passado no hotel tem que ser de no mínimo 1 dia");
        }

    }
}
