package Ejercicio1;

public class Disco {
    private String title;
    private int year;
    private int numberSongs;

    public Disco(String title, int year, int numberSongs) {
        this.title = title;
        this.year = year;
        this.numberSongs = numberSongs;
    }
    public String toString(){
        return "Titulo: " + title +
                "\nAño: " + year +
                "\nNumero de canciones: " + numberSongs;
    }
}
