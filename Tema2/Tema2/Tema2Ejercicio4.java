package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio4 {
    public static double dollar2euro(double eur) {
        return eur * 1.05412 ;
    }
    public static double euro2dollar(double doll) {
        return doll * 0.948658 ;
    }
    public static void showMenu() {
        System.out.println("Elije : ");
        System.out.println("1. Euros a Dollars \n2. Dollars aEuros");
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        double eur = 0;
        double doll = 0;
        showMenu();
        int choose =in.nextInt();

        if (choose == 1) {
            System.out.print("Introduce la cantidad de dolares que quieres convertir : ");
            eur = in.nextDouble();
            System.out.println("Tienes " + dollar2euro(eur) + " euros");
        } else if (choose == 2)
            System.out.print("Introduce la cantidad de euros que quieres convertir  : ");
            doll = in.nextDouble();
        System.out.println("Tienes " + euro2dollar(doll) + " dolares");
    }
}


