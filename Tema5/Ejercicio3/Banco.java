package Ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;
public class Banco {
    static Scanner in = new Scanner (System.in);
    static ArrayList<Usuario> banco = new ArrayList<>();
    public static void main(String[] args) {
        boolean exitQueue = false;
        do {
            switch (menu()){
                case 1:
                    addUser();
                    break;
                case 2:
                    removeFirstUser();
                    break;
                case 3:
                    System.out.println("Introduce el numero de cola: ");
                    int numberQueue = in.nextInt();
                    removeAnyUser(numberQueue);
                    break;
                case 4:
                    exitQueue = true;
                    break;
            }
        }while (!exitQueue);

    }
    public static int menu(){
        System.out.println("1. Añadir a un usuario a la cola" +
                "\n2. Eliminar el primer usuario" +
                "\n3. Eliminar cualquier usuario");
        System.out.print("Introduzca la seleccion: ");
        int option = in.nextInt();
        return option;
    }
    public static void addUser(){
        System.out.println("Introduce el nombre: ");
        String name = in.next();
        System.out.println("Introduce la edad: ");
        int age = in.nextInt();
        System.out.println("Introduce el dni: ");
        String dni = in.next();
        Usuario usuario = new Usuario(name,age,dni);
        banco.add(usuario);
    }

    public static void removeFirstUser(){
        if (!banco.isEmpty()){
            Usuario removeFirstUser = banco.remove(0);
            System.out.println("El primer usuario ha sido atendido");
        } else {
            System.out.println("No hay nadie en cola");
        }
    }
    public static void removeAnyUser(int posicion){
        if(!banco.isEmpty()){
            Usuario removeAnyUser = banco.remove(posicion);
            System.out.println("Se ha eliminado el usuario en cola");
        } else {
            System.out.println("Este usuario no se encuentra en cola");
        }
    }

}
