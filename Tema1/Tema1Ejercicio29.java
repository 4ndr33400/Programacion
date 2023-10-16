import java.util.Random;
import java.util.Scanner;
public class Tema1Ejercicio29 {
    public static void main(String[] arg) {
        Scanner lemons = new Scanner(System.in);

        Random random = new Random();
        int numero = random.nextInt(50);
        System.out.println("Escribe un numero, tienes 10 intentos para adivinarlo ");
        int contador = 1;
        int intentos = 0;

        while (contador != numero) {
            int N = lemons.nextInt();
            if (numero == N) {
                intentos++;
                System.out.println("Has acertado el numero en " + intentos + " intentos");
                break;

            } else if (intentos >= 10 - 1 ) {
                System.out.println ("Has perdido :'(  el numero era " + numero);
                break;
            }
            else if (numero > N) {
                System.out.println("Piensa en un numero mayor");
                intentos ++;

            } else if (numero < N) {
                System.out.println("Piensa en un numero menor");
                intentos++;

            }
        }
    }
}