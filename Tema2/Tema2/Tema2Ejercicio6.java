package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio6 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int numero =1;
        System.out.println("Introduce n para ver todas la tablas de multiplicar del 1 - 10");
        while (numero < 11 ){
            Tema2Ejercicio5.tablas(numero);
            numero++;
        }
    }
}
