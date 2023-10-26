package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio6 {
    public static void tables (int numero){
        int  multiplicar =0;
        int resultado = 0;
        while (multiplicar < 11){
            System.out.println(numero + "*" + multiplicar +" = " + resultado);
            multiplicar ++;
            resultado = numero * multiplicar ;
        }
    }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int numero =1;
        System.out.println("Introduce n para ver todas la tablas de multiplicar del 1 - 10");
        while (numero < 11 ){
            tables(numero);
            numero++;
        }
    }
}
