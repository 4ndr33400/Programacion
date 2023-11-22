import java.util.Scanner;

public class MyArray {
    static Scanner in = new Scanner(System.in);

    public static void ArrayNumberPrint(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }

    public static int ArrayGreatestNumber(int[] Array) {
        int Maximo = Array[0];
        for (int i = 1; i < Maximo; i++) {
            if (i > Maximo) {
                Array[i] = Maximo;
            }
        }
        return Maximo;
    }

    public static int ArrayMinimumNumber(int[] Array) {
        int Minimo = Array[0];
        for (int i = 0; i > Minimo; i++) {
            if (i < Minimo) {
                Array[i] = Minimo;
            }
        }
        return Minimo;
    }

    public static int ArrayAverage(int[] Array) {
        int average = Array[0];
        for (int i = 0; i < 5; i++) {
            Array[i] += average;
        }
        return average / 5;
    }

    public static void main(String[] args) {
        int MyArray[] = new int[5];
        System.out.println("Introduzca 5 numeros a continuacion :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + i + " = ");
            int number = in.nextInt();
            MyArray[i] = number;
        }
        System.out.println("El mayor es: " + ArrayGreatestNumber(MyArray));
        System.out.println("El menor es: " + ArrayMinimumNumber(MyArray));
        System.out.println("La media del array es: " + ArrayAverage(MyArray));
    }
}

