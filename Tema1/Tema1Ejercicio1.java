package Tema1Ejercicio1;

import java.util.Scanner;
public class Tema1Ejercicio1 {
    public static void main (String[] arg) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int A = in.nextInt();

        System.out.println("Elije entre: \n1 Superficie \n2 Perimetro");
        int choice = in.nextInt();
        int res = 0;


        if (choice == 1) {
            res = L * A;
        } else if (choice == 2) {
            res = L * 4;
        } else if (choice == 3) {
            System.out.println("dude ._.");
        }
        System.out.println("The result is " + res);
    }
}
