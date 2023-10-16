import java.util.Scanner;
public class Tema1Ejercicio16 {
    public static void main (String [] arg){
        Scanner in = new Scanner (System.in);

        System.out.println ("Elije entre \n1.  D \n2.  E");


        int choice= in.nextInt();

        if (choice == 1){

            System.out.println("Introduce la cantidad a convertir");

            double N = in.nextDouble();
            double res = 0;
            res = N*1.0831;

            System.out.println (N + " € son " + res + " dolares");


        } else if (choice == 2 ) {

            System.out.println("Escribe la cantidad en dolares que desees convertir a euros");

            double N = in.nextDouble();
            double res = 0;

            res = N*0.95;

            System.out.println( N + " dolares son " + res + "€" );

        }
    }
}
