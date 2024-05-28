package Ejercicio1;

import java.util.List;

public abstract class Artista {
    private String name;
    private int year;
    private String musicGenre;
    private List<Disco> artistDiscos;

    public Artista(String name, int year,String musicGenre) {
        this.name = name;
        this.year = year;
        this.musicGenre = musicGenre;
        this.artistDiscos = artistDiscos;
    }

    public String getName() {
        return name;
    }

    public List<Disco> getArtistDiscos() {
        return artistDiscos;
    }

    public String toString() {
        return "Nombre: " + name +
                "\nAño: " + year +
                "\nGenero de musica: " + musicGenre;
    }
}
