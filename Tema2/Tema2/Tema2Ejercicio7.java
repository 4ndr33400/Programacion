package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio7 {
    public static void esPrimo(int primo){
        boolean esPrimo = true;
        for (int divisor = 2; divisor < primo; divisor++) {
            if (primo % divisor == 0) {
            esPrimo = false;    }
        }
    }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int Numero = 1;
        System.out.println("A continuacion introduce los numeros que desee identificar como primos");
        while (Numero != 0){
            Numero = in.nextInt();
            esPrimo(Numero);
            if (Numero == 0){
                System.out.println("Bye bye");
                break;
            }
        }
    }
}
