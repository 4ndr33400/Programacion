import java.util.Scanner;
public class Tema1Ejercicio8 {
    public static void main(String []args) {
        Scanner in = new Scanner (System.in);

    System.out.println("Escribe la cantidad en euros que desees convertir a dolares");

    double N = in.nextDouble();
    double res = 0;

    res = N*1.0831;

    System.out.println( N + "€ son " + res + " dolares " );


    }
}
