package POO_Polimorfismo.Ejercicio1;

import java.util.ArrayList;

public  class Vehicle {
    public String licensePlate;
    public int incomeMoment;

    public String getLicensePlate() {
        return licensePlate;
    }

    public  void checkVehicle(){
        System.out.println("Se ha revisado el vehiculo");
    }
    public  void checkTime(){
        System.out.println("El vehiculo ha entrado a la hora");
    }
    public  String toString(){
        return "Matricula: " + getLicensePlate() +
                "\nHora de llegada: " + incomeMoment;
    }
}
