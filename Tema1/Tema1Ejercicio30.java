
import java.util.Scanner;
public class Tema1Ejercicio30 {
   public static void main(String [] args){
       Scanner in = new Scanner (System.in);
       char seguir;








       do {
           double A,B,sol;
           char signo;


           System.out.println("Escribe un valor");
           A = in.nextFloat();


           System.out.println("Elije que operacion deseas realizar : \n + \n - \n * \n / \n %");
           signo = in.next().charAt(0);


           System.out.println("Escribe otro valor");
           B = in.nextDouble();






           switch (signo) {


               case '+':
                   sol = A + B;
                   System.out.println("El resultado a la suma es " + sol);
                   break;


               case '-':
                   if (A > B){
                       sol = A - B;
                       System.out.println ("El resultado a la resta es " + sol);
                   } else if (B > A) {
                       sol = B - A ;
                       System.out.println("El resultado a la resta es " + sol);
                   }
                   break;
               case '*' :
                   sol = A * B;
                   System.out.println("El resultado a la multiplicacion es " + sol);
                   break;


               case '/':
                   sol = A/B;
                   System.out.println("El resultado a la division es " + sol);
                   break;


               case '%' :
                   sol = A%B;
                   System.out.println("El resultado al modulo es " + sol);
                   break;
           }
           System.out.println("Hacer otra operacion? Introduce si o no");
           seguir = in.next().charAt(0);
       } while (seguir == 's');
   }
   
}