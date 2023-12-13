import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner in = new Scanner(System.in);
    static String opcion;
    static int[] array = new int[5];

    public static void main(String[] args) {
        for (int i = 0; i < array.length ; i++){
            System.out.println("Introduce un caracter");
            int numero = in.nextInt();
            array[i] = numero;
        }
        System.out.println(Arrays.toString(array));

        do {
            System.out.println("Para salir del menu introduzca el numero 3 o escriba next");
            String next = in.next();
            mostrarMenu();
            opcion = in.next();
            switch (opcion) {
                case "1":
                    System.out.print("Introduce un numero para saber si es perfecto :");
                    int numero = in.nextInt();
                    System.out.println(Act1(numero));
                    break;
                case "2":
                    System.out.print("Introduzca su sexo :");
                    String sexo = in.nextLine();
                    System.out.print("Introduzca su edad :");
                    int edad = in.nextInt();
                    System.out.println("Sus costes seran de " + Act2(sexo, edad));
                    break;
                case "3":
                    double precio = 0;
                    System.out.println("Su precio final fue :" + comprobacionImpuestos(precio));
                    break;
                case "4":
                    System.out.println(aprobadosSuspendidos());
                    break;
                case "6":
                    System.out.println(sonAmigos());
                case "7":
                    System.out.println(maximoArray(array));
                case "8" :
                    System.out.println(existe(array));
                case "9" :
                    System.out.println(Arrays.toString(sumaArray(array)));
                case "10" :
                    System.out.println(Arrays.toString(numerosIguales(array)));
            }
            if (opcion.equals("5")) {
                System.out.println("bye");
                break;
            }
        } while (!opcion.equals("5"));
    }

    public static void mostrarMenu() {
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("\n 1.Comprobar si un numero es real." +
                "\n 2.Agencia de seguros." +
                "\n 3.Impuestos." +
                "\n 4.Aprobados suspendidos.");
        System.out.print("Introduzca su eleccion :");

    }

    public static boolean Act1(int numero) {
        boolean comprobar = false;
        int numeroCalc = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                numeroCalc += i;
            }
            if (numeroCalc == numero) {
                comprobar = true;
            }
        }
        return comprobar;
    }

    public static String Act2(String sexo, int edad) {
        String prima = null;
        int edadMinimaHombre = 25;
        int edadMinimaMujer = 21;
        if (sexo.equals("hombre")) {
            if (edad < edadMinimaHombre) {
                prima = "1000 euros";
            } else {
                prima = "700 euros";
            }
        } else {
            if (edad < edadMinimaMujer) {
                prima = "800 euros";
            } else {
                prima = "500 euros";
            }
        }
        return prima;
    }

    public static double comprobacionImpuestos(double producto) {
        double resultadofinal = 0;
        do {
            System.out.print("De que tipo fue el producto? :");
            String tipo = in.nextLine();
            System.out.print("Cual fue el precio de su producto? :");
            producto = in.nextDouble();
            opcion = in.nextLine();
            System.out.println("Introduzca stop si deseea pasar a ver el precio final o introduzca next para seguir introduciendo datos");
            opcion = in.nextLine();

            if (tipo.equals("Exclusivo")) {
                producto = producto * 0.30;
            } else if (tipo.equals("Lujo")) {
                producto = producto * 0.20;
            } else if (tipo.equals("Económico")) {
                producto = producto * 0.10;
            } else {
                producto = producto * 0.05;
            }

            resultadofinal += producto;

        } while (!opcion.equals("stop"));
        return resultadofinal;
    }

    public static String aprobadosSuspendidos() {
        int aprobado = 0;
        int suspendido = 0;
        String resultado = "Han habido mas suspendidos";

        do {
            System.out.println("Introduce las notas de los estudiantes");
            double nota = in.nextDouble();

            if (nota >= 5) {
                aprobado++;
            } else {
                suspendido++;
            }

            if (aprobado > suspendido) {
                resultado = "han habido mas aprobados";
            } else if (aprobado == suspendido) {
                resultado = "Han habido la misma cantidad de suspendidos y aprobados";
            }


            System.out.println("Quieres continuar?");
            opcion = in.next();

        } while (!opcion.equals("stop"));
        return resultado;
    }

    public static boolean sonAmigos() {
        boolean sonAmigos = false;
        int numero = 0;
        int numero2 = 0;
        int numeroresult = 0;
        int numeroresult2 = 0;
        System.out.print("Introduce el primer numero :");
        numero = in.nextInt();
        System.out.print("Introduce el segundo numero :");
        numero2 = in.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                numeroresult += i;
            }
        }
        for (int j = 1; j < numero2; j++) {
            if (numero2 % j == 0) {
                numeroresult2 += j;
            }
        }
        if (numero == numeroresult2 && numero2 == numeroresult) {
            sonAmigos = true;
        }
        return sonAmigos;
    }
    public static int maximoArray (int[] Array){
        int maximo = array[0];
        for (int i = 0; i < Array.length ; i++){
            if (maximo < Array[i]){
                maximo = Array[i];
            }
        }
        return maximo;
    }
    public static boolean existe (int[] Array){
        boolean resultado = false;

        System.out.print("Introduce un numero: ");
        int numero = in.nextInt();

        for (int i = 0; i < Array.length ; i++){
            if(numero == Array[i]){
                resultado = true;
            }
        }

        return resultado;
    }
    public static int[] sumaArray (int [] Array){
        int[] array2 = new int[5];
        System.out.println("Crea otro array");
        for (int i = 0; i < array2.length ; i++){
            System.out.println("Introduce un caracter");
            int numero = in.nextInt();
            array2[i] = numero;
        }
        System.out.println(Arrays.toString(array2));
        int [] suma = new  int[Array.length];
        for (int i = 0; i < Array.length || i < array2.length; i++){
            suma[i] = Array[i] + array2[i];
        }
        return  suma;
    }
    public static int[] numerosIguales(int[] Array){
        int [] array2 = new int[Array.length];
        Arrays.fill(array2,0);

        for(int i = 0; i < Array.length / 2; i++){
            System.out.print("Introduce una posicion : ");
            int posicion = in.nextInt();
            do {
                System.out.println("Introduce otra posicion : ");

            int posicion2 = in.nextInt();
            if (Array[posicion] == Array[posicion2]){
                array2[posicion2] = Array[posicion2];
                array2[posicion] = Array[posicion];
            }
            System.out.println(Arrays.toString(array2));
        }
        return array2;
    }
}
