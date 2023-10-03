import java.util.Scanner;
public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Escribe dos numeros");

        int A = in.nextInt();
        int B = in.nextInt();
        int res = 0;

        if (A > B ) { res = A-B;
        } else { res = B-A; }

        System.out.println ("El resultado es " + res);

    }

}
