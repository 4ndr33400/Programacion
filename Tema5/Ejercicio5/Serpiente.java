package Ejercicio5;

public class Serpiente extends Avistamientos{
    double length;
    String specie;

    public Serpiente(int timeDay, double lenght,String specie) {
        super(timeDay);
        this.length = lenght;
        this.specie = specie;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLongitud: " + length +
                "\nEspecie: " + specie;
    }
}
