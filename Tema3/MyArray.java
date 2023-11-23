import java.util.Scanner;

public class MyArray {
    static int MyArray[] = new int[5];
    static Scanner in = new Scanner(System.in);
    public static void CreateArray(){

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
    public static int SumArray (int [] Array){
        System.out.println("Introduce los valores del segundo array :");
        int counter = 0;
        int sum = 0 ;
        int MyArray2[] = new int[5];
        for (int i = 0; i < MyArray2.length ;i++){
                System.out.print("Numero " + (i+1) + " = ");
                int number = in.nextInt();
                MyArray2[i] = number;
        }
        System.out.print("Introduzca un numero del Array 1 :");
        int Vector1 = in.nextInt();
        for (int k : MyArray) {
            if (k == Vector1) {
                counter++;
            } else {
                System.out.println("El valor introducido del primer array no es correcto");
                break;
            }
        }
        System.out.print("Introduzca un numero del Array 2 :");
        int Vector2 = in.nextInt();
        for (int j : MyArray2) {
            if (j == Vector2) {
                counter++;
            } else {
                System.out.println("El valor introducido del segundo array no es correcto");
                break;
            }
        }
        if (counter == 2){
            sum = Vector1+Vector2;
        }
        return sum;
    }
    public static void main(String[] args) {
        int MyArray[] = new int[5];
        System.out.println("Introduzca 5 numeros a continuacion :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i+1) + " = ");
            int number = in.nextInt();
            MyArray[i] = number;
        }
        /*
        System.out.println("El mayor es: " + ArrayGreatestNumber(MyArray));
        System.out.println("El menor es: " + ArrayMinimumNumber(MyArray));
        System.out.println("La media del array es: " + ArrayAverage(MyArray));
        System.out.println(ArrayExistence(MyArray));
         */
        System.out.println(SumArray(MyArray));
    }
}

