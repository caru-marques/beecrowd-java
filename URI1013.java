/*O Maior

Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

maiorAB = (a + b + abs(a - b)) / 2;

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

Exemplos de Entrada     |     Exemplos de Saída
     7 14 106                   106 eh o maior
     217 14 6                   217 eh o maior

*/

import java.util.Scanner;

public class URI1013 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, maiorAB, maiorABC;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");

        teclado.close();
    }
}