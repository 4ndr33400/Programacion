import java.util.Scanner;
public class Tema1Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escriba un numero");

        int N= in.nextInt ();

        if (N > 0) {
            System.out.println ("El numero es positivo");
        } else if ( N < 0) {
            System.out.println ("El numero es negativo");
        } else if (N == 0 ) {
            System.out.println ("El numero es 0");
        }

    }




}
