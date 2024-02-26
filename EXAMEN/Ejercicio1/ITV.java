package Ejercicio1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ITV {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    private static ArrayList<Vehiculo> vehiculos;

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        String isNext;
        int numeroVehiculo = 0;
        do {

            System.out.println("Ha entrado un vehiculo");
            System.out.print("Quieres recibirlo?: ");
            isNext = in.nextLine().toLowerCase();

            if (isNext.equals("si")) {

                int tipoVehiculo = random.nextInt(3);


            } else {
                for (Vehiculo vehiculo : vehiculos) {
                    System.out.println(vehiculo);
                }
                System.out.println("Adios");
                break;
            }
            numeroVehiculo++;
        } while (!isNext.equals("no"));
    }

    private static void addVehicle(int tipoVehiculo) {

        System.out.println("Cual es la matricula del vehiculo");
        int matricula = in.nextInt();
        in.nextLine();
        System.out.println("Cual es el modelo del vehiculo");
        String modeloVehiculo = in.nextLine();
        System.out.println("Cual es el color del vehiculo");
        String color = in.nextLine();

        switch (tipoVehiculo){
                case 1:
                    System.out.println("Ha entrado un Turismo");
                    System.out.print("Cuantos asientos tiene el Turismo?: ");
                    int numeroAsientos = in.nextInt();
                    vehiculos.add(new Turismo(matricula,modeloVehiculo,color, numeroAsientos));
                case 2:
                    System.out.println("");
                case 3:
            }
    }
}
