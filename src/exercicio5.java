/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.
 * Data: 16/04
 */

 import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        
        //variaveis
        String nome,sobrenome,cidadedenascimento,dados;
        int idade;

        //entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("escreva seu nome ");
        nome = teclado.next();
        System.out.println("escreva seu sobrenome ");
        sobrenome = teclado.next();
        System.out.println("escreva sua idade ");
        idade = teclado.nextInt();
        System.out.println("escreva onde você nasceu ");
        cidadedenascimento = teclado.next();
        System.out.println("Deseja visualizar dados completos? escreva s pra sim e n pra não");
        dados = teclado.next();
        System.out.println(" ");
        teclado.close();

        //processamento/saida
        if(dados.equals("s")){
            System.out.println(nome + " " + sobrenome);
            System.out.println("nasceu em " + cidadedenascimento);
            System.out.println(idade + " anos");
        }else if (dados.equals("n")){
            System.out.println(nome);
            System.out.println(idade + " anos");
        }else{
            System.out.println("Digitação errada. Tente Novamente");
        }
        
        
    }
    
}
