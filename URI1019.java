/*Conversão de Tempo

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no 
formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplos de Entrada     |     Exemplos de Saída
        556                         0:9:16
         1                          0:0:1
       140153                      38:55:53

*/
import java.util.Scanner;

public class URI1019 {
    public static void main (String [] args) { 
        
        Scanner teclado = new Scanner(System.in);
        int h, m, s, resto;
        int valor = teclado.nextInt();

        h = valor / 3600;
        resto = valor % 3600;

        m = resto / 60;
        resto = resto % 60;

        s = resto;

        System.out.println(h + ":" + m + ":" + s);

        teclado.close();
    }
}