import java.util.Scanner;
public class Tema1Ejercicio13 {
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Pon una hora por consola");

        int H = in.nextInt();
        int M = in.nextInt();
        int S = in.nextInt();

        S++;

      if (S >= 60) { S = 0; M++;
          if (M >= 60) { M = 0; H++;
              if (H >= 24) { H = 0;
              } else {System.out.println(H + " horas " + M + " minutos " + S +  " segundos");
              }
          } else {System.out.println(H + " horas " + M +  " minutos " + S + " segundos");
          }
      }else{ System.out.println(H + " horas " + M +  " minutos " + S +  " segundos");
      }
    }
}
