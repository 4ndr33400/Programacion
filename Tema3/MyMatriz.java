import java.util.Arrays;
import java.util.Scanner;

public class MyMatriz {
    static Scanner in = new Scanner(System.in);

    public static void menuMatriz() {
        System.out.println("Elige una de las siguientes opciones a continuacion :");
        System.out.println(" a) Imprime la matriz." +
                "\n b) Cual es el maximo numero en la matriz." +
                "\n c) Cual es el minimo numero en la matriz." +
                "\n d) Cual es la media de la matriz." +
                "\n e) El elemento existe en la matriz?." +
                "\n f) Cual es la suma de estos dos vectores." +
                "\n g) Cual es la resta de estos dos vectores." +
                "\n h) CUal es el producto escalar de estos dos vectores." +
                "\n i) Invierte el orden de la siguiente matriz." +
                "\n j) Averigua si la matriz es capicua.");
    }

    public static int[][] CreateMatriz(int filas, int columnas) {
        int [][] createMatriz = new int[filas][columnas];
        for(int x = 0; x < createMatriz.length ; x++){
            for(int y = 0 ; y < createMatriz[x].length; y++ ){
                System.out.println("Introduce el dato de la fila " + (x+1) + " columna " +(y+1) + " :");
                int numero = in.nextInt();
                createMatriz[x][y] = numero;
            }
        }
        return createMatriz;
    }


    public static void MatrizPrint(int[][] MyMatriz) {
        for (int x = 0; x < MyMatriz.length; x++) {
            for (int y = 0; y < MyMatriz[x].length; y++)
            System.out.println(Arrays.toString(MyMatriz));
            break;
        }
    }


    public static int ArrayGreatestNumber(int[] Array) {
        int Maximo = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > Maximo) {
                Maximo = Array[i];
            }
        }
        return Maximo;
    }


    public static int ArrayMinimumNumber(int[] Array) {
        int Minimo = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < Minimo) {
                Minimo = Array[i];
            }
        }
        return Minimo;
    }


    public static double ArrayAverage(int[] Array) {
        double average = Array[0];
        for (int i = 0; i < 5; i++) {
            average += Array[i];
        }
        return average / Array.length;
    }

    public static String ArrayExistence(int[] Array) {
        String ValueValidator = "Ese valor no esta en el array";
        System.out.print("Introduce el numero que desees comprobar si esta en el array: ");
        int Number = in.nextInt();
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == Number) {
                ValueValidator = "Ese valor esta en el array";
            }
        }
        return ValueValidator;
    }


    public static int[] SumArray(int[] MyArray1, int[] MyArray2) {
        int[] suma = new int[6];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++) {
            suma[i] = MyArray1[i] + MyArray2[i];
        }
        return suma;
    }


    public static int[] RestArray(int[] MyArray1, int[] MyArray2) {
        int[] resta = new int[6];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++) {
            resta[i] = MyArray1[i] - MyArray2[i];
        }
        return resta;
    }


    public static int EscalarProductArray(int[] MyArray1, int[] MyArray2) {
        int result = 0;
        int[] producto = new int[3];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++) {
            producto[i] = MyArray1[i] * MyArray2[i];
            result += producto[i];
        }
        return result;
    }

    public static void InvertirArray(int[] MyArray1) {
        int k;
        for (int i = 0; i < MyArray1.length / 2; i++) {
            k = MyArray1[i];
            MyArray1[i] = MyArray1[MyArray1.length - i - 1];
            MyArray1[MyArray1.length - i - 1] = k;
        }
        System.out.println(Arrays.toString(MyArray1));
    }

    public static String ArrayCapicua(int[] MyArray1) {
        String esCapicua = "Es capicua";
        int length = MyArray1.length;
        for (int i = 0; i < MyArray1.length / 2; i++) {
            if (MyArray1[i] != MyArray1[length - i - 1]) {
                esCapicua = "No es capicua";
            }
        }
        return esCapicua;
    }

    public static void main(String[] args) {
        int[][] MyMatriz1;
        int[][] MyMatriz2;

        System.out.println("Introduzca el numero de filas que quiere que tenga su Matriz :");
        int numeroFilas = in.nextInt();
        System.out.println("Introduzca el numero de columnas que quiere que tenga su Matriz :");
        int numeroColumnas = in.nextInt();

        menuMatriz();
        System.out.print("Introduzca la letra de la opcion :");
        String eleccion = in.nextLine();
        switch (eleccion) {
            case "a":
                MyMatriz1 = CreateMatriz(numeroFilas, numeroColumnas);
                MatrizPrint(MyMatriz1);
                break;
                /*
            case "b":
                MyMatriz1 = CreateArray();
                System.out.println("El mayor es: " + ArrayGreatestNumber(MyMatriz1));
                break;
            case "c":
                MyMatriz1 = CreateArray();
                System.out.println("El menor es: " + ArrayMinimumNumber(MyMatriz1));
                break;
            case "d":
                MyMatriz1 = CreateArray();
                System.out.println("La media de " + Arrays.toString(MyMatriz1) + " es " + ArrayAverage(MyMatriz1));
                break;
            case "e":
                MyMatriz1 = CreateArray();
                System.out.println(ArrayExistence(MyMatriz1));
                break;
            case "f":
                MyMatriz1 = CreateArray();
                MyMatriz2 = CreateArray();
                System.out.println("La suma entre " + Arrays.toString(MyMatriz1) + " y " + Arrays.toString(MyMatriz2) + " es " + Arrays.toString(SumArray(MyMatriz1, MyMatriz2)));
                break;
            case "g":
                MyMatriz1 = CreateArray();
                MyMatriz2 = CreateArray();
                System.out.println("La resta entre " + Arrays.toString(MyMatriz1) + " y " + Arrays.toString(MyMatriz2) + " es " + Arrays.toString(RestArray(MyMatriz1, MyMatriz2)));
                break;
            case "h":
                MyMatriz1 = CreateArray();
                MyMatriz2 = CreateArray();
                System.out.println("El producto escalar de " + Arrays.toString(MyMatriz1) + " y " + Arrays.toString(MyMatriz2) + " es " + EscalarProductArray(MyMatriz1, MyMatriz2));
                break;
            case "i":
                MyMatriz1 = CreateArray();
                System.out.println("Este array  " + Arrays.toString(MyMatriz1) + " invertido se ve asi: ");
                InvertirArray(MyMatriz1);
                break;
            case "j":
                MyMatriz1 = CreateArray();
                System.out.println("Es el siguiente array capicua? " + Arrays.toString(MyMatriz1) + ArrayCapicua(MyMatriz1));
                break;
        }

                 */
        }
    }
}
