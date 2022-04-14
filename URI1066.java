import java.util.Scanner;

public class URI1066 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int pares=0, impares=0, positivos=0, negativos=0;

        for (int i = 0 ; i < 5 ; i++ ) {
            int valores = teclado.nextInt(); 
            if ( valores > 0 ) {
                positivos++;
            } else if ( valores < 0 ) {
                negativos++;
            } 
            if ( valores % 2 == 0 ) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        teclado.close();

    }
}