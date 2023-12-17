public class HundirLaFlota {
    static int filas = 10;
    static int columnas = 10;
    static char[][] tablero;
    public static void main(String[] args) {


    }
    public static char[][] crearTablero (){
        tablero = new char[filas][columnas];
        for(int x = 0; x < filas; x++){
            for (int y = 0; y < columnas; y++){
                tablero[x][y] = '-';
            }
        }
        return tablero;
    }
    public static void imprimirTablero(char[][] tablero){
        System.out.println(" A B C D E F G H I J");
        for (int x = 0; x < filas ; x++){
            System.out.println(x + 1 + " ");
            for (int y = 0; y < columnas ; y++){
                System.out.println(tablero[x][y] + " ");
            }
            System.out.println();
        }
    }
}
