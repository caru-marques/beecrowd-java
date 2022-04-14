/*Feliz Nataaal!

Você fica tão feliz no natal que tem vontade de gritar para todo mundo: "Feliz natal!!". Pra colocar toda essa 
felicidade pra fora, você montou um programa que, colocado um índice I de felicidade, seu grito de natal é mais 
animado.

Entrada
A entrada é composta por um inteiro I (1 < I ≤ 10^4) que representa o índice de felicidade.

Saída
A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a última letra a da frase. Uma quebra de 
linha é necessária após a impressão da frase.

Exemplos de Entrada     |     Exemplos de Saída
        5                      Feliz nataaaaal!

*/

import java.util.Scanner;

public class URI2483 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a;
        a = teclado.nextInt();

        System.out.print("Feliz nat");
        for (int i = 0; i < a; i++) {
            System.out.print("a");
        }
        System.out.print("l!");
        
        teclado.close();
    }    
}