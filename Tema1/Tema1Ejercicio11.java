import java.util.Scanner;
public class Tema1Ejercicio11 {
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);

        System.out.println ("Escribe tres numeros");

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (B == A+1)  {
            if ( C == B+1) {
                System.out.println("Los numeros estan ordenados");
            } else {
                System.out.println ("Los numeros no estan ordenados");
            }
        } else {
            System.out.println ("Los numeros no estan ordenados");

        }
    }
}
