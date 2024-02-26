package Ejercicio1;

public class Ciclomotor extends Vehiculo{
    private int numeroRevoluciones;

    public Ciclomotor(int matricula, String modeloVehiculo, String color, int numeroRevoluciones) {
        super(matricula, modeloVehiculo, color);
        this.numeroRevoluciones = numeroRevoluciones;
    }
    public boolean puedesConducir(){
        boolean puedesConducir = false ;
        if (numeroRevoluciones < 200){
            puedesConducir = true;
        }
        return puedesConducir;
    }
}
