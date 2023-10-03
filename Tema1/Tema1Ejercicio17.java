import java.util.Scanner;
public class Tema1Ejercicio17 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);

        System.out.println ("Elija entre \n0. Para superficie y perimetro de un cuadrado   \n1. Para superficie y perimetro de un rectangulo \n2. Para la superficie de un triangulo ");

        int choice = in.nextInt();

        if (choice == 0 ){

            System.out.println("Introduce el Largo del cuadrado");
            int largo = in.nextInt();
            System.out.println("Introduce el Ancho del cuadrado");
            int ancho = in.nextInt();

            int resS = 0;
            int resP = 0;

           resS = largo * ancho;
           resP = largo * 4;

           System.out.println ("El perimetro del cuadrado es " + resP + " y la superficie es " + resS);


        } else if (choice == 1 ){

            System.out.println ("Introduce el Largo del rectangulo");
            int largo = in.nextInt();
            System.out.println ("Introduce el Ancho del rectangulo");
            int ancho = in.nextInt();

            int resS = 0;
            int resP = 0;

            resS = largo * ancho;
            resP = (largo *2) + (ancho *2);

            System.out.println ("El perimetro del rectangulo es " + resP + " y la superficie es " + resS);


        } else if (choice == 2 ){
            System.out.println("Introduzca la altura del triangulo");
            int altura = in.nextInt();
            System.out.println("Introduzca la base del triangulo");
            int base = in.nextInt();

            int res=0;

            res = (altura*base)/2;

            System.out.println("El perimetro del triangulo " + res );


        }
    }
}
