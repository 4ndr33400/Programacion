package POO_Polimorfismo.Ejercicio1;
import java.util.Random;
import java.util.Scanner;

public class ITVPruebas {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    static String licensePlate;

    public static void main(String[] args) {
        int numeroVehiculos = 0;

      Vehicle[] vehicles = new Vehicle[5];
      do{
          System.out.println("Ha entrado un nuevo vehiculo");
          System.out.print("Si lo quiere recibir introduzca next: ");
          String option = in.nextLine().toLowerCase();
          if(option.equals("next")){
              int vehicleType = random.nextInt(1, 3) + 1;
              switch (vehicleType) {
                  case 1:
                      System.out.println("Ha entrado un Turismo: ");
                      System.out.println("Cual es el numero de matricula?: ");
                      licensePlate = in.nextLine();
                      vehicles[numeroVehiculos] = new Turism();
                      break;
                  case 2:
                      System.out.println("Ha entrado un Camion");
                      System.out.println("Cual es el numero de matricula?: ");
                      licensePlate = in.nextLine();
                      vehicles[numeroVehiculos] = new Truck();
                      break;
                  case 3:
                      System.out.println("Ha entrado una moto");
                      System.out.println("Cual es el numero de matricula?: ");
                      licensePlate = in.nextLine();
                      vehicles[numeroVehiculos] = new Cyclomotor();
                      break;
              }
              numeroVehiculos++;
          } else if (!option.equals("next") || numeroVehiculos <= 5){
              for (int i = 0; i < vehicles.length; i++){
                  Vehicle vehicle = vehicles[i];
                  System.out.println("Coche numero " + i);
                  System.out.println(vehicle);
              }
              System.out.println("Adioh");
              break;
          }

      }while(numeroVehiculos <= 5);



    }
}
