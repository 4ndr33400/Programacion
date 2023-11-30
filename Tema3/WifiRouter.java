import java.util.Arrays;
import java.util.Scanner;

public class WifiRouter {
    static int habitacionesNum = 20;
    static int[] ArrayRouter = new int[habitacionesNum];
    static int PotenciaRouter = 5;


    public static void ComprobacionRouter(int[] ArrayRouter, int numeroHabitacion, int PotenciaRouter) {
        for (int i = 0; i < PotenciaRouter; i++) {
           if (numeroHabitacion + i >= 0){
               ArrayRouter[numeroHabitacion + i] = i;
           }
           if(numeroHabitacion - i < numeroHabitacion) {
               ArrayRouter[numeroHabitacion - i] = i;
           }
        }
        System.out.println(Arrays.toString(ArrayRouter));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la habitacion en la cual desee ver la potencia del router :");
        int numeroHabitacion = in.nextInt();
        ComprobacionRouter(ArrayRouter,numeroHabitacion,PotenciaRouter);
    }
}
