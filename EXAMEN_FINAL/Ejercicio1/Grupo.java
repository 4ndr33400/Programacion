package Ejercicio1;

import java.util.List;

public class Grupo extends Artista{
    private int numberComponents;

    public Grupo(String name, int year,String musicGenre, List<Disco> artistDiscos, int numberComponents) {
        super(name, year, musicGenre, artistDiscos);
        this.numberComponents = numberComponents;
    }
    public String toString() {
        return super.toString() +
                "\nNumero de componentes del grupo : " + numberComponents;
    }
}
