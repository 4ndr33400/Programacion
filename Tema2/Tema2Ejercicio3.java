
import java.util.Scanner;
public class Tema2Ejercicio3 {
   public static boolean validRadius(int rad){
       if (rad > 0){
           return true;
       }else return false;
   }
   public static double calculateCirclePerimeter(double rad){
       return 3.14*rad;
   }
   public static double calculateCircleArea(double rad){
       return 3.14*rad*rad;
   }
   public static void main (String [] args){
       Scanner wawa = new Scanner (System.in);
       double rad = wawa.nextDouble();
       System.out.println("El area del circulo es " +calculateCircleArea(rad));
       System.out.println("El perimetro del circulo es " + calculateCirclePerimeter(rad));
   }
}
