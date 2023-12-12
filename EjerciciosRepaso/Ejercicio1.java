import java.util.Scanner;

public class Ejercicio1 {
    static Scanner in = new Scanner (System.in);
    static String opcion ;
    public static void main (String[] args){
        do {
            System.out.println("Para salir del menu introduzca el numero 3 o escriba next ");
            String next = in.nextLine();
            mostrarMenu();
            opcion = in.nextLine();
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
                    System.out.println("Sus costes seran de " + Act2(sexo,edad));
                case "3":
                    double precio = 0;
                    System.out.println("Su precio final fue :" + comprobacionImpuestos(precio));

            }
            if (opcion.equals("5")){
                System.out.println("bye");
                break;
            }
        } while (!opcion.equals("5"));
    }
    public static void mostrarMenu(){
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("\n 1.Comprobar si un numero es real." +
                "\n 2.Agencia de seguros." +
                "\n 3.Salir");
        System.out.print("Introduzca su eleccion :");

    }
    public static boolean Act1(int numero){
        boolean comprobar = false;
        int numeroCalc = 0;
        for(int i = 1; i < numero ; i++){
            if (numero % i == 0){
                numeroCalc += i ;
            }
            if (numeroCalc == numero){
                comprobar = true;
            }
        }
        return comprobar;
    }
    public static String Act2(String sexo, int edad){
        String prima = null;
        int edadMinimaHombre = 25;
        int edadMinimaMujer = 21;
        if (sexo.equals("hombre")){
            if (edad < edadMinimaHombre){
                prima = "1000 euros";
            } else {
                prima = "700 euros";
            }
        } else {
            if (edad < edadMinimaMujer){
                prima = "800 euros";
            } else {
                prima = "500 euros";
            }
        }
        return prima;
    }
    public static double comprobacionImpuestos (double producto) {
        double resultadofinal = 0;
        do {

            System.out.print("Cual fue el precio de su producto? :");
            producto = in.nextDouble();
            System.out.print("De que tipo fue el producto? :");
            String tipo = in.nextLine();
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
}
