import java.util.Scanner;
public class Tema1Ejercicio5 {
    public static void main (String [] args){

        Scanner in = new Scanner (System.in);

        System.out.println ("Escribe tres numeros");

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        double res = 0;
        int res2 = 0;

        res = (double) (A + B + C) /3;
        res2 = (A+B+C)/3;

        System.out.println("La media con decimales es " + res + " y la media sin decimales es " + res2);

    }
}
