import java.util.Scanner;
class Tema1Ejercicio9 {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);

        System.out.println ("Introduce un numero");
        double X = in.nextDouble ();
        System.out.println ("Introduce otro numero");
        double Y = in.nextDouble();
        double res = 0;
        System.out.println(" Elije entre:   \n1. + \n2. * \n3. / \n4. %");
        int choice = in.nextInt();

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
