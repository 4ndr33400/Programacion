package Ejercicio1;

public class Vehiculo {
    private int matricula;
    private String modeloVehiculo;
    private String color;

    public Vehiculo(int matricula, String modeloVehiculo, String color) {
        this.matricula = matricula;
        this.modeloVehiculo = modeloVehiculo;
        this.color = color;
    }


    public String toString(){
        return "Matricula: " + matricula +
                "\nModelo vehiculo: " + modeloVehiculo +
                "\nColor vehiculo: " + color;
    }
}
