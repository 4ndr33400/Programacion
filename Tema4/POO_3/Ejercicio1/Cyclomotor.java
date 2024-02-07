package POO_3.Ejercicio1;

public class Cyclomotor extends Vehiculo{
    public int displacement;

    public Cyclomotor(String licensePlate, int numberWheels, String color, int displacement) {
        super(licensePlate, numberWheels, color);
        this.displacement = displacement;
    }
    public boolean doYouNeedLicense(){
        boolean resultNeedLicense = false;
        if (displacement >= 125){
            resultNeedLicense = true;
        }
        return resultNeedLicense;
    }
}
