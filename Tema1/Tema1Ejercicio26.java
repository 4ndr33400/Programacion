import java.util.Scanner;
public class Tema1Ejercicio26 {
   public static void main (String [] args){
       Scanner wa = new Scanner(System.in);
       System.out.println("Introduce un numero para saber si es primo o no");
       int N = wa.nextInt();
       int contador = 2;
       boolean primo = true;
       while ((primo) && contador != N) {
           if (N % contador == 0)
               primo = false;
           contador++;
           if (N % 2 == 0) {
               System.out.println("El numero no es primo");
           } else { System.out.println("El numero es primo");}
       }
   }
}
