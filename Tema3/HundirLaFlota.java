import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HundirLaFlota {
    static int filas = 11;
    static int columnas = 11;
    static char[][] tablero;
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        crearTablero();
        imprimirTablero(colocarBarcos());
        turnoBatalla();

    }

    public static char[][] crearTablero() {
        tablero = new char[filas][columnas];
        int valorletra = 65;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i > 0 && j == 0) {
                    char num = (char) (i - 1 + '0');
                    tablero[i][j] = num;
                } else if (i == 0 && j > 0) {
                    char num_letra = (char) valorletra;
                    tablero[i][j] = num_letra;
                    valorletra++;
                } else {
                    tablero[i][j] = '-';
                }
            }
        }
        tablero[0][0] = ' ';
        return tablero;
    }

    public static void imprimirTablero(char[][] tablero) {
        for (char[] ints : tablero) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static char[][] colocarBarcos() {
        int lanchasPosicionadas = 0;
        do {
            filas = random.nextInt(1, 10);
            columnas = random.nextInt(1, 10);
            if (tablero[filas][columnas] == '-') {
                tablero[filas][columnas] = 'L';
                lanchasPosicionadas++;
            }
        } while (lanchasPosicionadas < 10);
        return tablero;
    }

    public static void turnoBatalla() {
        boolean victoria = false;
        int intentos = 50;
        while (!victoria && intentos > 0){

            System.out.print("Introduce la fila (0 - 9): ");
            int filaElegida = in.nextInt() + 1;
            System.out.print("Introduce la columna (A - J): ");
            char columnaElegida = in.next().charAt(0);

            int columnaCambio = cambiarNumeroLetra(columnaElegida);
            if (tablero[filaElegida][columnaCambio] == 'L'){
                System.out.println("Le has dado a un barco");
                tablero[filaElegida][columnaCambio] = 'X';
            }else {
                System.out.println("Has tocado water jiji!");
                tablero[filaElegida][columnaCambio] = 'A';
            }
            imprimirTablero(tablero);

            intentos --;
            if (quedanBarcos() == 0){
                System.out.println("Le has dado a todos los barcos :D");
                victoria = true;

            }
        }
    }
    public static int quedanBarcos(){
        int contador = 0;
        for (int x = 1 ; x < tablero.length ; x++){
            for (int y = 1; y < tablero.length ;y++){
                if (tablero[x][y] == 'L'){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int cambiarNumeroLetra(char columnas) {
        return switch (columnas) {
            default -> -1;
            case 'A' -> 1;
            case 'B' -> 2;
            case 'C' -> 3;
            case 'D' -> 4;
            case 'E' -> 5;
            case 'F' -> 6;
            case 'G' -> 7;
            case 'H' -> 8;
            case 'I' -> 9;
            case 'J' -> 10;
        };
    }
}
