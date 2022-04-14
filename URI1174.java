/*Seleçao em Vetor I

Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam 
um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

Entrada
A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

Saída
Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o 
valor armazenado na posição, com uma casa após o ponto decimal.

Exemplos de Entrada     |     Exemplos de Saída
         0                       A[0] = 0.0
        -5                       A[1] = -5.0
        63                       A[3] = -8.5
        -8.5                        ...
        ...                             
          
*/
import java.util.Scanner;

public class URI1174 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        double vetor[];

        vetor = new Vertor[100]; 

        for (int i=0 ; i<vetor.length; i++) {
			System.out.println("A[" + i + "] = " + vetor[i]);

        teclado.close();




    }
}
