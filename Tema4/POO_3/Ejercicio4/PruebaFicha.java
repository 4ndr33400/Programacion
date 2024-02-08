package POO_3.Ejercicio4;

import java.util.Scanner;

public class PruebaFicha {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Que va a alquilar?: " +
                "\n1. Un libro" +
                "\n2. Revista" +
                "\n3. DVD");
        System.out.print("Introduce la seleccion: ");
        int option = in.nextInt();
        System.out.print("Cual es el numero de lista?: ");
        int numberList = in.nextInt();
        System.out.print("Introduce el titulo: ");
        String title = in.nextLine();
        switch (option) {
            case 1:
                System.out.print("Introduce el autor: ");
                String author = in.nextLine();
                System.out.print("Introduce la editorial: ");
                String editorial = in.nextLine();
                Libro libro = new Libro(numberList, title, author, editorial);
                System.out.println(libro);
                break;
            case 2:
                System.out.print("Cual es el numero de publicacion: ");
                int publishNumber = in.nextInt();
                System.out.print("Cual es el año de publicacion: ");
                int yearPublish = in.nextInt();
                Revistas revista = new Revistas(numberList, title, publishNumber, yearPublish);
                System.out.println(revista);
                break;
            case 3:
                System.out.print("Introduce el director: ");
                String director = in.nextLine();
                System.out.print("Introduce el año de publicacion: ");
                int year = in.nextInt();
                System.out.print("Cual es el genero de la pelicula?: ");
                String genreMovie = in.nextLine();
                DVD dvd = new DVD(numberList, title, director, year, genreMovie);
                System.out.println(dvd);
                break;
        }
    }
}
