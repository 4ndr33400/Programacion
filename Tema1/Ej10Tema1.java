import java.util.Scanner;
public class Ej10Tema1 {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);

        double X = in.nextDouble ();
        double Y = in.nextDouble ();
        double res = 0;
        System.out.println(" choices lol \n1 + \n2 * \n3 / \n4 %");
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
