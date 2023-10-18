import java.util.Random;
import java.util.Scanner;
class Tema1Ejericio28 {
   public static void main(String [] arg) {
       Scanner lemonhope = new Scanner(System.in);


       Random random = new Random();


       int randomInt = random.nextInt(99999);
       System.out.println("Lets see if u are lucky" + randomInt);
       int contador = 0;


       while (contador <= 5) {
           System.out.println("Introduce a number");
           int N = lemonhope.nextInt();


           if (N == randomInt) {
               System.out.println("You won the lottery");
               break;
           } else {
               System.out.println("U werent luck today");
           }
           contador++;


       }
   }
}