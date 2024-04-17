package Ejercicio5;

public class Pajaros extends Avistamientos{
    double weigth;
    String specie;

    public Pajaros(int timeDay,double weigth,String specie) {
        super(timeDay);
        this.weigth = weigth;
        this.specie = specie;
    }
}
