package Ejercicio2;

import java.util.List;
import java.util.Scanner;

public class MainBanco {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void menu(){
        System.out.println("1. Añadir tarjeta" +
                "\n2. Añadir dinero" +
                "\n3. Eliminar tarjeta." +
                "\n4. Realizar transferencia." +
                "\n5. Recibir transferencia.");
        System.out.println("Introudece la seleccion: ");
        int option = in.nextInt();
    }
    public static void choiceMenu(int option){

    }
}
