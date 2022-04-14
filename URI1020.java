/*Idade em Dias

Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca 
haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de 
testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

Exemplos de Entrada     |     Exemplos de Saída
       400                      1 ano(s)
                                1 mes(es)
                                5 dia(s)
                                    
       800                      2 ano(s)
                                2 mes(es)
                                10 dia(s)
                                    
       30                       2 ano(s)
                                2 mes(es)
                                10 dia(s)
*/

import java.util.Scanner;

public class URI1020 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano, meses, dias, resto;
        int x = teclado.nextInt();

        ano = x / 365;
        resto = x % 365;

        meses = resto / 30;
        resto = resto % 30;

        dias = resto;

        System.out.println(ano +" ano(s)");
        System.out.println(meses +" mes(es)");
        System.out.println(dias +" dia(s)");

        teclado.close();

    }
}