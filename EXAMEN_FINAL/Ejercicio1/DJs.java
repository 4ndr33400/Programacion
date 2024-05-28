package Ejercicio1;

import java.util.List;

public class DJs extends Artista{
    private String pseudonim;
    public DJs(String name, int year,String musicGenre, List<Disco> artistDiscos,String pseudonim) {
        super(name, year, musicGenre, artistDiscos);
        this.pseudonim = pseudonim;
    }
    public String toString() {
        return super.toString() +
                "\nPseudonimo : " + pseudonim;
    }
}
