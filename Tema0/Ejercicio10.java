import java.util.Scanner;
public class Ejercicio10 {
        public static void main (String[] arg){
            Scanner in = new Scanner(System.in);

            float X = in.nextFloat ();
            float Y = in.nextFloat ();
            float res = 0;
            System.out.println(" choices  \n1 + \n2 * \n3 / \n4 %");
            float choice=in.nextFloat();

            if (choice ==1 ) {
                res=X+Y;
            } else if (choice ==2) {
                res =X*Y;
            } else if (choice ==3) {
                res = X/Y;
            }else if (choice ==4) {
                res = X%Y;
            }
            System.out.println ("The result is "+ res);
        }



    }

