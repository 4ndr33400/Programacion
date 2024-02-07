package POO_3.Ejercicio1;

public class Truck extends Vehiculo{
    public int maxWeight;
    public String isItDangerous;

    public Truck(String licensePlate, int numberWheels, String color,int maxWeight, String isItDangerous) {
        super(licensePlate, numberWheels, color);
        this.isItDangerous = isItDangerous;
        this.maxWeight = maxWeight;
    }

    public boolean isItDangerous(){
        boolean resultIsItDangerous = false;
        if (isItDangerous.equals("SI")){
            resultIsItDangerous = true;
        }
        return resultIsItDangerous;
    }

}
