package Ejercicio1;

public class Camion extends Vehiculo{
    private int numeroRuedas;
    public Camion(int matricula, String modeloVehiculo, String color, int numeroRuedas) {
        super(matricula, modeloVehiculo, color);
        this.numeroRuedas = numeroRuedas;
    }
    public boolean esUnCamion(){
        boolean isTruck = false;
        if (numeroRuedas > 4){
            isTruck = true;
        }
        return isTruck;
    }
}
