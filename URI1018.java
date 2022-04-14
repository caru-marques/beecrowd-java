/*Cédulas

Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Exemplos de Entrada     |     Exemplos de Saída
        576                 576
                            5 nota(s) de R$ 100,00
                            1 nota(s) de R$ 50,00
                            1 nota(s) de R$ 20,00
                            0 nota(s) de R$ 10,00
                            1 nota(s) de R$ 5,00
                            0 nota(s) de R$ 2,00
                            1 nota(s) de R$ 1,00

	
        11257               11257
                            112 nota(s) de R$ 100,00
                            1 nota(s) de R$ 50,00
                            0 nota(s) de R$ 20,00
                            0 nota(s) de R$ 10,00
                            1 nota(s) de R$ 5,00
                            1 nota(s) de R$ 2,00
                            0 nota(s) de R$ 1,00

        503                 503
                            5 nota(s) de R$ 100,00
                            0 nota(s) de R$ 50,00
                            0 nota(s) de R$ 20,00
                            0 nota(s) de R$ 10,00
                            0 nota(s) de R$ 5,00
                            1 nota(s) de R$ 2,00
                            1 nota(s) de R$ 1,00

*/
import java.util.Scanner;

public class URI1018 {
    public static void main (String [] args) {
        
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d, e, f, g, resto;
        int valor = teclado.nextInt();

        a = valor / 100;
        resto = valor % 100;

        b = resto / 50;
        resto = resto % 50; 
        
        c = resto / 20;
        resto = resto % 20;

        d = resto / 10;
        resto = resto % 10;

        e = resto / 5;
        resto = resto % 5;

        f = resto / 2;
        resto = resto % 2;

        g = resto / 1;

        System.out.println(valor);
        System.out.println(a + " nota(s) de R$ 100,00");
        System.out.println(b + " nota(s) de R$ 50,00");
        System.out.println(c + " nota(s) de R$ 20,00");
        System.out.println(d + " nota(s) de R$ 10,00");
        System.out.println(e + " nota(s) de R$ 5,00");
        System.out.println(f + " nota(s) de R$ 2,00");
        System.out.println(g + " nota(s) de R$ 1,00");

        teclado.close();
    }
}