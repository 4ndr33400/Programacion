package Ejercicio2;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Gimnasio {
    static Scanner in = new Scanner(System.in);
    Map<String, Usuario> gimnasio = new HashMap<>();
    public static void main(String[] args) {
        boolean exitMenu = false;
        do {
            switch (menu()){
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:
                    exitMenu= true;
                    break;
            }
        }while (!exitMenu);
    }
    public static int menu(){
        System.out.println("1. Dar de alta a un usuario" +
                "\n2. Dar de baja a un usuario" +
                "\n3. Mostrar datos de un usuario" +
                "\n4. Modificar un usuario");
        System.out.print("Introduzca la seleccion: ");
        int option = in.nextInt();
        return option;
    }
    public static void addUser(){
        System.out.println("");
    }
}
