import java.util.Scanner;
public class Tema1Ejercicio10 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);

        System.out.println ("Escribe tres numeros");

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (A<B) {
            if (B<C) {
                System.out.println("Los numeros estan organizados");
            } else {
                System.out.println("Los numeros no estan organizados");
            }
        } else {
            System.out.println("Los numeros no estan organizados");

        }

    }
}
