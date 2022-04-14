import java.util.Scanner;

public class URI1067 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int valor, cont;
        valor = teclado.nextInt();

        for ( cont = 1; cont <= valor; cont++ ) {
            if ( valor % 2 != 0 ) {
                valor++;
                System.out.println(cont);
            }
        }

        teclado.close();
    }
}