import java.util.Scanner;
public class Tema1Ejercicio22 {
    public static void main (String [] arg ){
        Scanner in = new Scanner (System.in);

        int i = in.nextInt();
        int count = 0;

        while (i != 0 ) {
            i = i/10;
            count ++;
            }
        System.out.println(count);
        }


    }

