/*Consumo

Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando 
o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".

Exemplos de Entrada     |     Exemplos de Saída
        500                      14.286 km/l
        35.0
                        
        2254                     18.119 km/l
        124.4
     
        1551                      9.802 km/l
        464.4                  
*/

import java.util.Scanner;

public class URI1014 {
    public static void main (String [] args) {
        
        Scanner teclado = new Scanner(System.in);
        int x;
        double y, consumo;

        x = teclado.nextInt();
        y = teclado.nextDouble();

        consumo = x / y;

        System.out.printf("%.3f km/l\n", consumo);

        teclado.close();
    }
}