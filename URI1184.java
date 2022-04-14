/*Abaixo da Diagonal Principal

Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a 
média considerando somente aqueles elementos que estão abaixo da diagonal principal da matriz, conforme ilustrado abaixo (área verde).




Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada 
com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

Exemplos de Entrada     |     Exemplos de Saída
         S                           12.6
        1.0
        0.0
       -3.5
        2.5
        4.1
        ...

*/

import java.util.Scanner;

public class URI1184 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double matriz[][] = new double [12][12];
        double res = 0;
        char op;
        int cont = 0;

        //Entrada
        op = teclado.nextLine().charAt(0);
        for(int l = 0; l < 12; l++) {
            for(int c = 0; c < 12; c++) {
                matriz[l][c] = teclado.nextDouble();
            }
        }

        //Processamento
        for(int l = 1; l < 12; l++) {
            for(int c = 0; c < l; c++) {
                res = res + matriz[l][c];
                cont++;
            }
        }

        if(op == 'S') {
            System.out.printf("%.1f\n", res);
        } else {
            System.out.printf("%.1f\n", res / cont);
        }

        teclado.close();
    }
}