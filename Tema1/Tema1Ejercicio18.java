import java.util.Scanner;
public class Tema1Ejercicio18 {
    public static void main (String [] arg ){
        Scanner in = new Scanner (System.in);

        System.out.println("Escribe un numero y calcularemos su raiz");

        double N = in.nextInt();

        if (N < 0 ){
            System.out.println("ERROR");
        } else {

            double test=Math.sqrt(N);
            if(test < 0 ) {
                System.out.println("ERROR");
            } else {
                System.out.println ("La raiz cuadrada es " + test);
            }
        }

    }
}
