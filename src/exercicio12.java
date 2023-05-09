/* Nome: Marcelo Henrique Silvestre da Silva
 * RA: 1352312397
 * Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)
 * Data: 08/05
 */

public class exercicio12 {
    public static void main(String[] args) {
        
        int i=0;
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i = i+1;
        } while(i < 7);

    }
}
