import java.util.Scanner;

public class MyArray {
    static Scanner in = new Scanner(System.in);

    public static int[] CreateArray(int[] MyArray) {
        System.out.println("Introduzca 5 numeros a continuacion :");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Numero " + i + " = ");
            int number = in.nextInt();
            MyArray[i] = number;
        }
        return MyArray;
    }

    public static void ArrayNumberPrint(int[] ArrayNumber) {
        for (int i = 0; i < ArrayNumber.length; i++) {
            System.out.println(ArrayNumber[i]);
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
    public static int ArrayMinimumNumber(int[] Array){
        int Minimo = Array[0];
        for (int i = 0; i > Minimo; i++){
            if (i < Minimo){
                Array[i]=Minimo;
            }
        }
        return Minimo;
    }
    public static void main(String[] args) {

        int ArrayNumber[] = new int[]{0};
        CreateArray(ArrayNumber);
        ArrayGreatestNumber(CreateArray(ArrayNumber));
        ArrayMinimumNumber(CreateArray(ArrayNumber));
        /*
        ArrayNumberPrint(ArrayNumber);
        ArrayGreatestNumber(CreateArray(ArrayNumber));
         */
    }
}

