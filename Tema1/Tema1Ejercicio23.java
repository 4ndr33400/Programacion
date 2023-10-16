import java.util.Scanner;
public class Tema1Ejercicio23 {
    public static void main (String [] arg ){
        Scanner in = new Scanner (System.in);
        System.out.println("Introduce un numero");


        double imput = in.nextDouble();
        double sum =0;
        double count =1;

        while (imput >= 0) {
            System.out.println ("Introduce otro numero");
            imput = in.nextDouble();


            if (imput >= 0) {
                sum = imput+sum;

            }
            imput++;
        }
        System.out.println ("La media de los numeros es "+ sum);

    }
}
