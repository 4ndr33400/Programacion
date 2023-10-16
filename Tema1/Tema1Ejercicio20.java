import  java.util.Scanner;
public class Tema1Ejercicio20 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);


        System.out.println ("Introduzca un numero");
        int A = in.nextInt();
        System.out.println("Introduce otro numero");
        int B = in.nextInt();

        if (B>A) {
            while (B >= A){
                if (A%2 != 0) {  System.out.println(A);

                }A++;
            }
        } else {System.out.println (A + " es mayor que " + B);}
    }
}
