package POO_Polimorfismo.Ejercicio1;
import java.util.Random;
import java.util.Scanner;

public class ITVPruebas {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        int numeroVehiculos = 1;

      Vehicle[] vehicles = new Vehicle[numeroVehiculos];
      do{
          System.out.println("Ha entrado un nuevo vehiculo");
          int vehicleType = random.nextInt();
          switch (vehicleType){
              case 1:
                  System.out.println("Ha entrado un Turismo: ");
                  vehicles[numeroVehiculos] = new Turism();
                  System.out.println("Cual es el numero de matricula?: ");
                  String licensePlate = in.nextLine();
              case 2:

          }

          numeroVehiculos++;
      }while();

    }
}
