package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio1 {
   public static int numberSign( int i) {
       int result = 0;
       if (i > 0) {
           result = 1;
       } else if (i < 0) {
           result = - 1;
       }
       return result;
   }
   public static void main(String [] args){
       Scanner in = new Scanner (System.in);
       System.out.print ("Introduce un numero :");
       int i = in.nextInt();
           System.out.println(numberSign(i));
       }
}
