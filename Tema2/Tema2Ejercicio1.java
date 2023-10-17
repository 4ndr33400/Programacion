import java.util.Scanner;
public class Tema2Ejercicio1 {
   public static int num( int i) {
       if (i > 0) {
           return 1;
       } else if (i < 0) {
           return -1;
       } else if (i == 0) {
           return 0;
       }
       return i;
   }
   public static void main(String [] args){
       Scanner wawa = new Scanner (System.in);
       System.out.println ("Introduce un numero");
       int i = wawa.nextInt();
           System.out.println(num(i));
       }
}
