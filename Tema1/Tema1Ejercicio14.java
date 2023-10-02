import java.util.Scanner;
public class Tema1Ejercicio14 {
    public static void main (String [] args ){
        Scanner in = new Scanner (System.in);

        System.out.println("Introduzca el numero de personas que deseen hospedarse");
        int P = in.nextInt();
        System.out.println("Introduzca los dias de estancia");
        int D = in.nextInt();

        int ResP = 0;
        int ResD = 0;
        int ResPD = 0;
        double ResO = 0;
        double ResPDD = 0;
        if  (P > 5  && D > 7  ) { ResP = P * 15; ResD = ResP * D ;  System.out.println ("Su precio final es " + ResP);

        } else  {  ResP = P * 15; ResD = ResP * D ;  ResO = (ResD * 25)/100; ResPDD = ResD - ResO; System.out.println ("Su precio final es " + ResPDD);}

    }
}
