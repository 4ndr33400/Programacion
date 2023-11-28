import java.util.Arrays;
import java.util.Scanner;


public class MyArray {
    static Scanner in = new Scanner(System.in);
    public static int[] CreateArray() {
        int MyArray[] = new int[3];
        System.out.println("Introduzca 5 numeros a continuacion :");
        for (int i = 0; i < 3; i++) {
            System.out.print("Numero " + (i + 1) + " = ");
            int number = in.nextInt();
            MyArray[i] = number;
        }
        return MyArray;
    }


    public static void ArrayNumberPrint(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
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
    public static String ArrayExistence(int[] Array){
        String ValueValidator = "Ese valor no esta en el array";
        System.out.print("Introduce el numero que desees comprobar si esta en el array: ");
        int Number = in.nextInt();
        for (int i = 0; i < Array.length; i++){
            if (Array[i] == Number){
                ValueValidator = "Ese valor esta en el array";
            }
        }
        return ValueValidator;
    }


    public static int[] SumArray (int [] MyArray1, int [] MyArray2){
        int[] suma = new int[3];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++){
            suma[i] = MyArray1[i] + MyArray2[i];
        }
        return suma;
    }


    public static int [] RestArray (int [] MyArray1,int[] MyArray2) {
        int[] resta = new int[3];
        for (int i = 0; i < MyArray1.length || i < MyArray2.length; i++) {
            resta[i] = MyArray1[i] - MyArray2[i];
        }
        return resta;
    }


    public static int EscalarProductArray (int [] MyArray1 , int[] MyArray2){
        int  result = 0;
        int[] producto = new int[3];
        for (int i = 0; i <MyArray1.length || i < MyArray2.length ; i++){
            producto[i] = MyArray1[i]*MyArray2[i];
            result += producto[i];
        }
        return result;
    }
    public static void InvertirArray(int [] MyArray1){


    }
    public static void main(String[] args) {
        int []MyArray1;
        int []MyArray2;
       /*
       System.out.println("El mayor es: " + ArrayGreatestNumber(MyArray));
       System.out.println("El menor es: " + ArrayMinimumNumber(MyArray));
       System.out.println("La media del array es: " + ArrayAverage(MyArray));
       System.out.println(ArrayExistence(MyArray));
       System.out.println("Array 1:");
       MyArray1= CreateArray();
       System.out.println("Array 2:");
       MyArray2 = CreateArray();
       System.out.println(Arrays.toString(SumArray(MyArray1, MyArray2)));
       System.out.println("Array 1:");
       MyArray1= CreateArray();
       System.out.println("Array 2:");
       MyArray2 = CreateArray();
       System.out.println(Arrays.toString(RestArray(MyArray1, MyArray2)));
       System.out.println("Array 1 :");
       MyArray1 = CreateArray();
       System.out.println("Array 2 :");
       MyArray2 = CreateArray();
       System.out.println(EscalarProductArray(MyArray1,MyArray2));
       */
    }
}

