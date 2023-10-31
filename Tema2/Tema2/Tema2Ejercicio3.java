package Tema2;
import java.util.Scanner;
public class Tema2Ejercicio3 {
   public static double calculateCirclePerimeter(double rad){
       return 3.14*rad;
   }
   public static double calculateCircleArea(double rad){
       return 3.14*rad*rad;
   }
   public static void main (String [] args){
       Scanner in = new Scanner (System.in);
       System.out.print("Introduce el radio de tu circulo :");
       double rad = in.nextDouble();
       System.out.println("El area del circulo es " + calculateCircleArea(rad));
       System.out.println("El perimetro del circulo es " + calculateCirclePerimeter(rad));
   }
}
