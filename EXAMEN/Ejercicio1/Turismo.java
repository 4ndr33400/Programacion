package Ejercicio1;

public class Turismo extends Vehiculo{
    private int numeroAsientos;
    public Turismo(int matricula, String modeloVehiculo, String color, int numeroAsientos) {
        super(matricula, modeloVehiculo, color);
        this.numeroAsientos = numeroAsientos;
    }
    public void cuantosAsientos(){
        if (numeroAsientos > 6){
            System.out.println("Un coche tiene mas de 6 asientos?");
        }
    }
}
