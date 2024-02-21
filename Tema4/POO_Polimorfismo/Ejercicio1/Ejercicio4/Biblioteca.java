package POO_Polimorfismo.Ejercicio1.Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    static int option;
    static Scanner in = new Scanner(System.in);
    static ArrayList<Producto> productos;
    static int codProduct;
    static String title;
    public static void main(String[] args) {
        do {
            System.out.println("1. Añadir item." +
                    "\n2. Buscar item." +
                    "\n3. Eliminar item." +
                    "\n4. Listado de la biblioteca." +
                    "\n5. Salir");
            System.out.print("Introduzca la eleccion: ");
            option = in.nextInt();
            switch (option){
                case 1:

            }

        }while(option != 5);
    }
    public static void addItem(Producto producto,String productType){
        switch (productType){
            case "DVD":
                System.out.print("Introduce el titulo del DVD: ");
                title = in.nextLine();
                System.out.print("Introduce el codigo del DVD:");
                codProduct = in.nextInt();
                productos.add(new DVD(codProduct,title));
            case "Revista":

        }
    }

}
