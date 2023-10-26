import java.util.Scanner;
public class Tema2Ejercicio4 {
    public static double dollar2euro(double eur) {
        return eur * 1.05412 ;
    }
    public static double euro2dollar(double doll) {
        return doll * 0.948658 ;
    }
    public static void showMenu() {
        System.out.println("Choose RAHHHH: ");
        System.out.println("1. Euros to Dollars \n2. Dollars to Euros");
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        double eur = 0;
        double doll = 0;
        showMenu();
        int choose =in.nextInt();

        if (choose == 1) {
            System.out.print("Introduce the amount of dollars you wanna convert : ");
            eur = in.nextDouble();
            System.out.println("You have " + dollar2euro(eur) + " euros");
        } else if (choose == 2)
            System.out.print("Introduce the amount of euros you wanna convert : ");
            doll = in.nextDouble();
        System.out.println("You have " + euro2dollar(doll) + " dollars");
    }
}


