package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtistsProgram {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        List<Artista> artistas = new ArrayList<>();
    }
    public static void artistMenuChoice(List<Artista> artistas){

        switch (menu()){
            case 1:
                addArtist(artistas);
                break;
            case 2:
                showArtist(artistas);
                break;
            case 3:
                deleteArtist(artistas);
                break;
            case 4:
                addNewDisco(artistas);
                break;
            case 5:
                showAllArtist(artistas);
            case 6:

            case 7:

        }
    }
    public static int menu(){
        System.out.println("Elige una de las siguientes opciones: " +
                "\n1. Añadir un artista." +
                "\n2. Mostrar artista." +
                "\n3. Borrar artista." +
                "\n4. Añadir un nuevo disco." +
                "\n5. Mostrar el listado de artista." +
                "\n6. Mostrar Cantantes." +
                "\n7. Salir");
        System.out.print("Introduce la seleccion: ");
        int option = in.nextInt();
        return option;
    }
    public static void addArtist(List<Artista> artistas){
        System.out.println("Que tipo de artista vas introducir?");
        System.out.println("1. Cantante." +
                "\n2. Grupo." +
                "\n3. DJ.");
        System.out.print("Introduce la seleccion: ");
        int selection = in.nextInt();
        chooseArtistType(selection,artistas);
    }
    public static void chooseArtistType(int typeArtist,List<Artista> artistas){
        System.out.println("Cual es el nombre de el artista?: ");
        String name = in.nextLine();
        System.out.println("En que año nacio este artista?: ");
        int year = in.nextInt();
        System.out.println("En que tipo de musica se especializa el cantante?: ");
        String typeMusic = in.nextLine();

        switch (typeArtist){
            case 1:
                artistas.add(new Cantante(name,year,typeMusic,addDisco()));
            case 2:
                System.out.println("De cuantas personas esta formado el grupo: ");
                int componentsGroup = in.nextInt();
                artistas.add(new Grupo(name,year,typeMusic,addDisco(),componentsGroup));
            case 3:
                System.out.println("Cual es el pseudonimo del DJ: ");
                String pseudonim = in.nextLine();
                artistas.add(new DJs(name,year,typeMusic,addDisco(),pseudonim));
        }
    }
    public static List<Disco> addDisco(){
        List<Disco> discos = new ArrayList<>();
        System.out.println("Cuantos discos?: ");
        int numberAlbums = in.nextInt();

        for (int i = 0; i < numberAlbums; i++){
            System.out.println("Cual es el titulo del disco?: ");
            String title = in.nextLine();
            System.out.println("En que año se publico este disco?: ");
            int yearOfRelease = in.nextInt();
            System.out.println("Cuantas canciones tiene este album?: ");
            int numberSongs = in.nextInt();

            discos.add(new Disco(title,yearOfRelease,numberSongs));
        }
        return discos;
    }
    public static void showArtist(List<Artista> artistas){
        System.out.println("Introduce el nombre del artista que quieres ver: ");
        String name = in.nextLine();

        for (Artista artista : artistas){
            if (artista.getName().equals(name)){
            System.out.println(artista);
            }
        }
    }

    public static void deleteArtist (List<Artista> artistas){
        System.out.println("Introduce el nombre del artista que deseas eliminar: ");
        String name = in.nextLine();

        for (Artista artista : artistas){
            if (artista.getName().equals(name)){
                artistas.remove(artista);
            }
        }
    }

    public static void addNewDisco (List<Artista> artistas){
        System.out.println("Introduce el nombre del artista del cual desees añadir un disco nuevo: ");
        String name = in.nextLine();

        for (Artista artista : artistas){
            if (artista.getName().equals(name)){
                List<Disco> newDiscos = addDisco();
                artista.getArtistDiscos().addAll(newDiscos);
            }
        }
    }

    public static void showAllArtist(List<Artista> artistas){
        for (Artista artista : artistas){
            System.out.println(artista);
        }
    }

    public static void showSingers (List<Artista> artistas){
        for (Artista artista : artistas){
            if (artistas instanceof Cantante){
                System.out.println(artista);
            }
        }
    }
}
