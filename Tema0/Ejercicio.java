import java.util.Scanner;
public class Ejercicio {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        int X =in.nextInt();
        int Y =in.nextInt();

        if (Y==X) {
            System.out.println("They are equals");
        } else if (X>Y){   System.out.println(X+ " is bigger than "+ Y);
        }else {System.out.println(Y+ " is bigger than "+X);
        }
        }
    }

