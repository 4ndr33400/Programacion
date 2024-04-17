package Ejercicio5;

public class ManadaLobos extends Avistamientos{
    int numberWolf;
    String observations;


    public ManadaLobos(int timeDay, int numberWolf, String observations) {
        super(timeDay);
        this.numberWolf = numberWolf;
        this.observations = observations;
    }
}
