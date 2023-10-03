import java.util.Scanner;
public class Tema1Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe tres numeros enteros : ) ");

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (A > B) {
            if (A > C) {
                System.out.println("The greatest is " + A);
            } else {
                System.out.println("The greater is " + C);
            }
        } else {
            if (B > C) {
                System.out.println("The greatest is " + B);

            } else {
                System.out.println("The greatest is " + C);

            }
        }

    }

}
