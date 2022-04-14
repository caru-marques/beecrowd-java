import java.util.Scanner;

public class URI1065 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float valor;
        int qtdePares = 0;

        for ( int cont = 1; cont <= 5; cont++ ) {
            valor = teclado.nextFloat();
            if ( valor %2 == 0 ) {
                qtdePares++;
            }
        }

        System.out.println(qtdePares + " valores pares");

        teclado.close();
    }
}