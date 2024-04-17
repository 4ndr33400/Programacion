package Ejercicio5;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParqueNatural {
    static Scanner in = new Scanner(System.in);
    static List<Avistamientos> avistamientos = new LinkedList<>();
    public static void main(String[] args) {
        boolean endOfDay = false;
        do {
            switch (menu()){
                case 1:
                    addSighting();
                    break;
                case 2:
                    showDiurnSightings();
                    break;
                case 3:
                    showNocturnSigthings();
                    break;
                case 4:
                    showWolfPack();
                    break;
                case 5:
                    showSnakes();
                    break;
                case 6:
                    showBirds();
                    break;
                case 7:
                    System.out.println("bye");
                    break;
            }
        }while(!endOfDay);
    }
    public static int menu(){
        System.out.println("1. Añadir avistamiento." +
                "\n2. Mostrar todos los avistamientos a partir de las 8:00 AM." +
                "\n3. Mostrar todos los avistamientos nocturnos(entre las 20:00h p.m - 08:00h a.m)" +
                "\n4. Mostrar manadas de losbos." +
                "\n5. Mostrar serpientes." +
                "\n6. Mostrar pajaros." +
                "\n7. Salir.");
        System.out.print("Introduce la seleccion: ");
        int option = in.nextInt();
        return option;
    }
    public static void addSighting(){
        System.out.println("Que animal has avistado?: " +
                "\n1. Una serpiente." +
                "\n2. Un pájaro." +
                "\n3. Una manada de lobos");
        System.out.print("Introduce la seleccion: ");
        int selection = in.nextInt();
        System.out.print("A que hora del dia fue este avistamiento?: ");
        int hourSighting = in.nextInt();

        switch (selection){
            case 1:
                System.out.print("Cual era la longitud de la serpiente?: ");
                double lenghtSnake = in.nextDouble();
                System.out.print("Cual era la especie de la serpiente?: ");
                String specieSnake = in.next();
                avistamientos.add(new Serpiente(hourSighting,lenghtSnake,specieSnake));
                break;
            case 2:
                System.out.print("Cual era peso del pajaro?: ");
                double weightBird = in.nextDouble();
                System.out.print("Cual era la especie del pajaro?: ");
                String specieBird = in.next();
                avistamientos.add(new Pajaros(hourSighting,weightBird,specieBird));
                break;
            case 3:
                System.out.print("Cuantos lobos se han visto?: ");
                int numberWolf = in.nextInt();
                System.out.print("Alguna observacion?: ");
                String observationsWolf = in.next();
                avistamientos.add(new ManadaLobos(hourSighting,numberWolf,observationsWolf));
                break;
        }
    }
    public static void showDiurnSightings(){
        for (Avistamientos avistamiento : avistamientos){
            if(avistamiento.getTimeDay() >= 8){
                System.out.println(avistamiento);
            }
        }
    }
    public static void showNocturnSigthings(){
        for (Avistamientos avistamiento : avistamientos){
            if (avistamiento.getTimeDay() >= 20 || avistamiento.getTimeDay() <= 8){
                System.out.println(avistamiento);
            }
        }
    }
    public static void showWolfPack(){
        for (Avistamientos avistamiento : avistamientos){
            if (avistamiento instanceof ManadaLobos){
                System.out.println(avistamiento);
            }
        }
    }
    public static void showSnakes(){
        for (Avistamientos avistamiento : avistamientos){
            if (avistamiento instanceof Serpiente){
                System.out.println(avistamiento);
            }
        }
    }
    public static void showBirds(){
        for (Avistamientos avistamiento : avistamientos){
            if (avistamiento instanceof Pajaros){
                System.out.println(avistamiento);
            }
        }
    }
}
