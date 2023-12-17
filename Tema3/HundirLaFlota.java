import java.util.Scanner;
import java.util.Random;

public class HundirLaFlota {
    static int filas = 10;
    static int columnas = 10;
    static char[][] tablero;
    static char[][] tableroVisible;
    static Random random = new Random();
    static Scanner in = new Scanner (System.in);


    public static void main(String[] args) {

        imprimirTablero(colocarBarcos());
        System.out.print("Introduce la fila (1 - 10) :");
        int filaElegida = in.nextInt();
        System.out.print("Introduce la columna (A - J):");
        char columnaElegida = in.next().charAt(0);
        turnoBatalla(filaElegida,columnaElegida);

    }

    public static char[][] crearTablero (){
        for(int x = 0; x < filas; x++){
            for (int y = 0; y < columnas; y++){
                tablero[x][y] = '-';

            }
        }
        return tablero;
    }
    public static void imprimirTablero(char[][] tablero){
        System.out.println(" A B C D E F G H I J");
        for (int x = 0; x < tablero.length ; x++){
            System.out.print(x + 1 + " ");
            for (int y = 0; y < tablero[x].length ; y++){
                System.out.print(tablero[x][y] + " ");
            }
            System.out.println();
        }
    }
    public static char[][] colocarBarcos(){
        int lanchasPosicionadas = 0;
            do {
                filas = random.nextInt(0,9);
                columnas = random.nextInt(0,9);
                if (tablero[filas][columnas] == '-'){
                    tablero[filas][columnas] = 'L';
                    lanchasPosicionadas++;
                }
            } while(lanchasPosicionadas < 10);
        return tablero;
    }
    public static void turnoBatalla (int filaElegida , char columnaElegida){
        int intentos = 50;
        int barcosHundidos = 0;
        boolean victoria = false;
        do {
            imprimirTablero(crearTablero());
            if (tablero[filaElegida][columnaElegida] == 'L'){
                System.out.println("Le has dado a un barco!");
                tablero[filaElegida][columnaElegida] = 'X';
                barcosHundidos++;
            } else {
                System.out.println("Vuelve a intentarlo!");
                tablero[filaElegida][columnaElegida] = 'A';
            }
            if (barcosHundidos >= 10){
                System.out.println("Has hundido todos los barcos!");
                victoria = true;
            }
            System.out.println("Te quedan " + intentos + " intentos");
        intentos--;
        } while (intentos != 0 || !victoria);

    }
}
