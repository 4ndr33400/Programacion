package Ejercicio2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Gimnasio {
    static Scanner in = new Scanner(System.in);
    static Map<String, Usuario> gimnasio = new HashMap<>();
    static String dni;
    public static void main(String[] args) {
        boolean exitMenu = false;

        do {
            switch (menu()){
                case 1:
                    addUser();
                    break;
                case 2:
                    System.out.print("Introduce el dni de la cuenta que quieras dar de baja: ");
                    dni = in.next();
                    removeUser(dni);
                    break;
                case 3:
                    System.out.print("Introduce el dni de la cuenta que quieres visualizar: ");
                    dni = in.next();
                    showInfoUser(dni);
                    break;
                case 4:
                    System.out.println("Introduce el dni de la cuenta que quieres modificar: ");
                    dni = in.next();
                    modifyUser(dni);
                    break;
                case 5:
                    exitMenu= true;
                    break;
            }
        }while (!exitMenu);
    }
    public static int menu(){
        System.out.println("1. Dar de alta a un usuario" +
                "\n2. Dar de baja a un usuario" +
                "\n3. Mostrar datos de un usuario" +
                "\n4. Modificar un usuario");
        System.out.print("Introduzca la seleccion: ");
        int option = in.nextInt();
        return option;
    }
    public static void addUser(){
        System.out.print("Introduzca su nombre: ");
        String name = in.next();
        System.out.print("Introduzca su edad: ");
        int age = in.nextInt();
        System.out.print("Introduzca el DNI: ");
        String dni = in.next();
        gimnasio.put(dni,new Usuario(name,age));
    }
    public static void removeUser(String dni){
        if (gimnasio.containsKey(dni)){
            gimnasio.remove(dni);
            System.out.println("El usuario con dni: " + dni + " ;ha sido dado de baja");
        } else {
            System.out.println("Este DNI no existe.");
        }
    }
    public static void showInfoUser(String dni){
        if (gimnasio.containsKey(dni)){
            Usuario usuario = gimnasio.get(dni);
            System.out.println("Nombre: " + usuario.getName() +
                    "\nEdad: " + usuario.getAge());
        } else {
            System.out.println("Este DNI no existe.");
        }
    }
    public static void modifyUser(String dni){
        System.out.print("Introduce el nuevo nombre: ");
        String newName = in.next();
        System.out.print("Introudce la nueva edad: ");
        int newAge = in.nextInt();
        Usuario modifiedUser = new Usuario(newName,newAge);
        if (gimnasio.containsKey(dni)){
            gimnasio.put(dni,modifiedUser);
            System.out.println("El usuario ha sido modificado!");
        } else{
            System.out.println("Este DNI no existe.");
        }
    }
}
