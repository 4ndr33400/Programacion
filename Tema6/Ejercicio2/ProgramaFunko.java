package Ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramaFunko {

    static Scanner in = new Scanner(System.in);
    static List<Funko> funkos = new ArrayList<>();
    static Path path = Path.of("/home/andmonper4/Desktop/funkos.csv");

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
        loadFunkos();

        switch(menu()){
            case 1:
                addFunko();
                break;
            case 2:
                deleteFunko();
                break;
            case 3:
                showAllFunkos();
                break;
            case 4:

            case 5:
                showModelsFunko();
                break;
            case 6:

            default:
                System.out.println("Esta opcion no es posible");
        }
    }
    public static void addFunko(){

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Cual es el codigo del Funko: ");
        String code = in.nextLine();
        System.out.println("Cual es el nombre del Funko: ");
        String name = in.nextLine();
        System.out.println("Cual es el modelo del Funko: ");
        String model = in.nextLine();
        System.out.println("Cual es el precio del Funko: ");
        Double price = in.nextDouble();
        System.out.println("Cual es la fecha de lanzamiento del Funko: ");
        String dateString = in.nextLine();
        Date date = new Date();
        try{
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        funkos.add(new Funko(code,name,model,price,date));
        saveFunkos(funkos);
    }
    public static List<Funko> loadFunkos(){

        List<String> dataCSV;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try{
            dataCSV = Files.readAllLines(path);
            for (int i = 0; i < dataCSV.size(); i++){
                dataFunkos.add(Arrays.toString(dataCSV.get(i).split(",")));
                double funkoPrice = Double.parseDouble(dataFunkos.get(3));
                Date date = new Date();

                    try {
                        Date fechaLanzamiento = dateFormat.parse(dataCSV.get(4));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    funkos.add(new Funko(dataFunkos.get(0), dataFunkos.get(1),dataFunkos.get(2),funkoPrice,date));
                    dataFunkos.clear();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }
    public static void saveFunkos(List<Funko> funkos){
        try {
            try {
                RandomAccessFile file = new RandomAccessFile(path.toFile(), "rw");
                file.setLength(0);
                file.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            for (Funko funko : funkos) {
                Files.write(Path.of(path.toUri()), funko.toString().getBytes());
            }
        } catch (Exception e){
            System.out.println("Error");
        }

    }
    public static void deleteFunko(){
        System.out.println("Codigo del funko a borrar: ");
        String code = in.nextLine();
        for (Funko funko : funkos){
            if (funko.getFunkoCode().equals(code)){
                funkos.remove(funko);
            }
        }
    }
    public static void showAllFunkos(){
        for (Funko funko : funkos){
            System.out.println(funko);
        }
    }
    public static void showModelsFunko(){

    }
}


