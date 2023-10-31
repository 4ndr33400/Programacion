package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio4 {
    public static double euro2dollar(double introduce_euros) {return introduce_euros * 1.06424 ;
    }
    public static double dollar2euro(double introduce_dolares) {return introduce_dolares * 0.939633 ;
    }
    public static void showMenu() {
        System.out.println("Elije : ");
        System.out.println("1. Dolares a Euros \n2. Euros a Dolares");
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        double euros = 0;
        double dolares = 0;
        showMenu();
        int choose =in.nextInt();

        if (choose == 1) {
            System.out.print("Introduce la cantidad de dolares que quieres convertir : ");
            euros = in.nextDouble();
            System.out.println("Tienes " + dollar2euro(euros) + " euros");
        } else if (choose == 2)
            System.out.print("Introduce la cantidad de euros que quieres convertir  : ");
            dolares = in.nextDouble();
        System.out.println("Tienes " + euro2dollar(dolares) + " dolares");
    }
}


