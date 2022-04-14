/*Notas e Moedas

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule 
o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 
20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

Exemplos de Entrada     |     Exemplos de Saída
     576 .73                NOTAS:
                            5 nota(s) de R$ 100,00
                            1 nota(s) de R$ 50,00
                            1 nota(s) de R$ 20,00
                            0 nota(s) de R$ 10,00
                            1 nota(s) de R$ 5,00
                            0 nota(s) de R$ 2,00
                            MOEDAS:
                            1 moeda(s) de R$ 1.00
                            1 moeda(s) de R$ 0.50
                            0 moeda(s) de R$ 0.25
                            2 moeda(s) de R$ 0.10
                            0 moeda(s) de R$ 0.05
                            3 moeda(s) de R$ 0.01

       4.00                 NOTAS:
                            0 nota(s) de R$ 100.00
                            0 nota(s) de R$ 50.00
                            0 nota(s) de R$ 20.00
                            0 nota(s) de R$ 10.00
                            0 nota(s) de R$ 5.00
                            2 nota(s) de R$ 2.00
                            MOEDAS:
                            0 moeda(s) de R$ 1.00
                            0 moeda(s) de R$ 0.50
                            0 moeda(s) de R$ 0.25
                            0 moeda(s) de R$ 0.10
                            0 moeda(s) de R$ 0.05
                            0 moeda(s) de R$ 0.01

       91.01                NOTAS:
                            0 nota(s) de R$ 100.00
                            1 nota(s) de R$ 50.00
                            2 nota(s) de R$ 20.00
                            0 nota(s) de R$ 10.00
                            0 nota(s) de R$ 5.00
                            0 nota(s) de R$ 2.00
                            MOEDAS:
                            1 moeda(s) de R$ 1.00
                            0 moeda(s) de R$ 0.50
                            0 moeda(s) de R$ 0.25
                            0 moeda(s) de R$ 0.10
                            0 moeda(s) de R$ 0.05
                            1 moeda(s) de R$ 0.01

*/

import java.util.Scanner;

public class URI1021{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double x = teclado.nextDouble();
        int n100, n50, n20, n10, n5, n2, m100, m50, m25, m10, m5, m1, resto;
        int cedula, moeda;

        cedula = (int)x;
        double centavos = x - cedula;
        moeda = (int)(centavos * 100);

        //Notas
        n100 = cedula / 100;
        resto = cedula % 100;
        n50 = resto / 50;
        resto = resto % 50;
        n20 = resto / 20;
        resto = resto % 20;
        n10 = resto / 10;
        resto = resto % 10;
        n5 = resto / 5;
        resto = resto % 5;
        n2 = resto / 2;
        resto = resto % 2;

        //Moedas
        m100 = resto % 2;
        m50 = moeda / 50;
        resto = moeda % 50;
        m25 = resto / 25;
        resto = resto % 25;
        m10 = resto / 10;
        resto = resto % 10;
        m5 = resto / 5;
        resto = resto % 5;
        m1 = resto % 5;

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m100 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m1 + " moeda(s) de R$ 0.01");

        teclado.close();
    }
}