package POO_3.Ejercicio1;

import java.util.Scanner;

public class VehiculoPruebas {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuantas ruedas tiene tu coche?: ");
        int numberWheels = in.nextInt();
        System.out.println("Cual es la matricula de tu vehiculo?: ");
        String licensePLateNumber = in.nextLine();
        in.nextLine();
        System.out.println("De que color es tu vehiculo?: ");
        String color = in.nextLine();
        in.nextLine();
        System.out.println("Que tipo de vehiculo tienes?: " +
                "\n1. Turismo" +
                "\n2. Camion" +
                "\n3. Ciclomotor");
        System.out.print("Introduce la seleccion: ");
        String typeOfVehicle = in.next();
        switch (typeOfVehicle) {
            case "1":
                System.out.print("Cuantos asientos tiene tu turismo: ");
                int numberSeats = in.nextInt();
                in.nextLine();
                System.out.print("Que tipo de uso le das?: ");
                String typeOfUse = in.nextLine();
                Turismo turismo = new Turismo(licensePLateNumber, numberWheels, color, numberSeats, typeOfUse);
                turismo.howManySeats();
                turismo.whatTypeOfUse();
                break;
            case "2":
                System.out.print("Cual es el peso máximo de tu camion?: ");
                int weight = in.nextInt();
                in.nextLine();
                System.out.print("La mercancia que transportas es peligrosa?: ");
                String dangerousGoods = in.nextLine().toLowerCase();
                Truck truck = new Truck(licensePLateNumber, numberWheels, color, weight, dangerousGoods);
                if (truck.isItDangerous()) {
                    System.out.println("Este camion transporta carga peligrosa");
                } else {
                    System.out.println("Este camion no tiene ningun tipo de carga peligrosa");
                }
                break;
            case "3":
                System.out.print("Cuantos cilindros tiene la moto?: ");
                int amountOfDisplacement = in.nextInt();
                Cyclomotor cyclomotor = new Cyclomotor(licensePLateNumber, numberWheels, color, amountOfDisplacement);
                if (cyclomotor.doYouNeedLicense()) {
                    System.out.println("Necesitas sacarte el carnet");
                } else {
                    System.out.println("No necesitas sacarte el carnet");
                }
                break;
        }
    }
}
