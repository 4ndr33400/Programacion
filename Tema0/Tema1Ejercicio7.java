import java.util.Scanner;
public class Tema1Ejercicio7 {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println ("Choose a number7 from 1-6");
        int N =in.nextInt();
        int RES = 0;
        if ((N<7) && (N>0)) {
            RES =7-N; System.out.println ("The result is "+ RES );
        } else System.out.println ("ERROR ._.");
    }
}
