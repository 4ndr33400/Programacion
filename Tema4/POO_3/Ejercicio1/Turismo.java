package POO_3.Ejercicio1;

public class Turismo extends Vehiculo{
    public int seats;
    public String typeOfUse;

    public Turismo(String licensePlate, int numberWheels, String color, int seats, String typeOfUse) {
        super(licensePlate, numberWheels, color);
        this.seats = seats;
        this.typeOfUse = typeOfUse;
    }
    public int getSeats() {
        return seats;
    }

    public String getTypeOfUse() {
        return typeOfUse;
    }

    public void howManySeats(){
        System.out.println("Este turismo tiene " + getSeats() + " asientos.");
    }
    public void whatTypeOfUse(){
        System.out.println("Este turismo es para uso " + getTypeOfUse() + ".");
    }
}
