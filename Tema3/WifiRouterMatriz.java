public class WifiRouterMatriz {
    static int numeroHabitacionesPlanta = 5;
    static int numeroPisos = 20;
    static int potenciaRouter = 5;
    static int[][] MatrizRouter = new int[numeroHabitacionesPlanta][numeroPisos];

    public static void imprimirMatriz (){

    }

    public static void comprobacionRouter (int[][] MatrizRouter , int numeroHabitacion , int numeroPiso){
        MatrizRouter[numeroHabitacion][numeroPiso] = potenciaRouter;

    }


}
