package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio7 {
    public static void esPrimo(int Primo){
        int contador =1;
        boolean primo = false;
        while (Primo >= contador ){
            contador++;
            if (Primo % contador == 0 && Primo != contador){
                primo = true;
            }
        }
        if (primo){
            System.out.println("Este es un numero primo :D");
        }else{
            System.out.println("No es un numero primo D:");
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
