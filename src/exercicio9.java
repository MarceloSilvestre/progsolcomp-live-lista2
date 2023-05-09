/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
 * Data: 16/04
 */

 import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        //variaveis
        double valordacompra,valorfinal;
        int formadepagamento;

        //entradas
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da compra ");
        valordacompra = teclado.nextDouble();
        System.out.println("Escolha a forma de pagamento digite\n 1- a Vista - desconto de 10%\n 2- a prazo (30 dias) - desconto de 5% \n 3- a prazo (60 dias) - valor inteiro \n 4- a prazo (90 dias) - acréscimo de 5% \n 5- cartão de débito - desconto de 8% \n 6- cartão de crédito - desconto de 7%");
        formadepagamento = teclado.nextInt(); 
        teclado.close();

        //processamento/saída
        switch(formadepagamento){
            case 1: valorfinal = valordacompra *0.9;
            System.out.println("O valor total é ser pago é R$ " + valorfinal);
            break;
            case 2: valorfinal = valordacompra * 0.95;
            System.out.println("O valor total é ser pago é R$ " + valorfinal);
            break;
            case 3: valorfinal = valordacompra;
            System.out.println("O valor total é ser pago é R$ " + valorfinal);
            break;
            case 4: valorfinal = valordacompra *1.05;
            System.out.println("O valor total é ser pago é R$ " + valorfinal);
            break;
            case 5: valorfinal = valordacompra *0.92;
            System.out.println("O valor total é ser pago é R$ " + valorfinal);
            break;
            case 6: valorfinal = valordacompra *0.93;
            System.out.println("O valor total é ser pago é R$ " + valorfinal);
            break;
            default: System.out.println("não existe essa opção");
        }
    }
}
