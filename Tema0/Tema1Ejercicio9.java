import java.util.Scanner;
public class Tema1Ejercicio9 {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);

        int X = in.nextInt ();
        int Y = in.nextInt ();
        int res = 0;
        System.out.println(" choices  \n1 + \n2 * \n3 / \n4 %");
        int choice=in.nextInt();

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
