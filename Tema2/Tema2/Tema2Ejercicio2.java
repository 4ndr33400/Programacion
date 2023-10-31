package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio2 {
    public static boolean isAdult(int edad) {
        boolean isAdult = true;
        if (edad < 18){
            isAdult = false;
        }
        return isAdult;
    }
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Introduce la edad");
        int age = in.nextInt();
        if (isAdult(age)){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
}


