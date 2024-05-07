package Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProgramaFunko {
    static Scanner in = new Scanner(System.in);
    static List<String> dataFunkos = new ArrayList<>();
    static List<Funko> funkos = new ArrayList<>();
    public static void main(String[] args) {
        switchMenu();
    }
    public static int menu(){
        System.out.println("1. Añadir funko." +
                "\n2. Borrar funko." +
                "\n3. Mostrar todos los funkos." +
                "\n4. Mostrar la media de precio de funkos." +
                "\n5. Mostrar modelos." +
                "\n6. Mostrar funkos de 2023.");
        System.out.print("Introduzca la seleccion: ");
        int option = in.nextInt();
        return option;
    }
    public static void switchMenu(){

        switch(menu()){
            case 1:
            addFunko();
            break;
            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            default:
                System.out.println("Esta opcion no es posible");
        }
    }
    public static void addFunko(){

    }
    public List<Funko> loadFunkos(){
        try {
            List<String> dataCSV = Files.readAllLines(Path.of(" "));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


