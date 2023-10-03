import java.util.Scanner;
public class Tema1Ejercicio12 {
    public static void main (String [] arg){
        Scanner  in = new Scanner (System.in);

    System.out.println ("Ponga tres numeros");

    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();

    if (A > B) {
        if ( A > C) {
            if ( B > C) { System.out.println ( A+">"+B+">"+C);
            } else { System.out.println ( A +">"+ C+">"+B );
            }
        } else { System.out.println ( C+">"+A+">"+B );
        }
    } else { if ( B > C ) {
        System.out.println ( B+">"+A+">"+C );
    } else {System.out.println ( C+">"+B+">"+A);
    }
    }

    }
}
