import java.util.Scanner;
public class Tema2Ejercicio2 {
   public static boolean isAdult (int edad){
       if (edad >=18){
           return true;
       }else return false;
   }
   public static void main(String [] args){
       Scanner lemons = new Scanner (System.in);
       System.out.println("Introduce la edad");


       int age = lemons.nextInt();


       if (isAdult(age)){
           System.out.println("Your 'baby' should b payin bills by now");
       } else {
           System.out.println("I hate toddlers");
       }


   }
}
