package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio5 {
    public static void tablas (int numero) {
        int multiplicar =0;
        int resultado = 0;
        while (multiplicar < 11){
            System.out.println(numero + "*" + multiplicar +" = " + resultado);
            multiplicar ++;
            resultado = numero * multiplicar ;
        }
    }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int numero;
        System.out.print("Introduce el numero del que desees ver las tablas de multiplicar :");
        numero = in.nextInt();
        tablas(numero);


    }
}

