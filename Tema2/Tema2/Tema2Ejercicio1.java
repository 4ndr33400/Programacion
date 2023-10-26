package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio1 {
   public static int num( int i) {
       if (i > 0) {
           System.out.println ("+");
       } else if (i < 0) {
           System.out.println ("-");
       } else if (i == 0) {
           System.out.println ("0");
       }
       return i;
   }
   public static void main(String [] args){
       Scanner in = new Scanner (System.in);
       System.out.println ("Introduce un numero");
       int i = in.nextInt();
           System.out.println(num(i));
       }
}
