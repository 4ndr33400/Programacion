package POO_Polimorfismo.Ejercicio1.Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    static Scanner in = new Scanner(System.in);
    private ArrayList<Producto> productos;
    public static void main(String[] args) {
        String productType;
        int codProduct;
        int option;
        Biblioteca biblioteca = new Biblioteca();
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
                    System.out.print("Que tipo de producto vas a añadir? (DVD, Libro o Revista): ");
                    in.nextLine();
                    productType = in.nextLine().toLowerCase();
                    biblioteca.addItem(productType);
                    break;
                case 2:
                    System.out.print("Introduce el codigo del item: ");
                    codProduct = in.nextInt();
                    biblioteca.findItem(codProduct);
                    break;
                case 3:
                    System.out.print("Cual es el codigo del producto");
                    codProduct = in.nextInt();
                    biblioteca.removeItem(codProduct);
                    break;
            }

        }while(option != 5);
    }

    public Biblioteca() {
        productos = new ArrayList<>();
    }
    public void addItem(String productType){
        System.out.print("Introduce el titulo de " + productType + ": ");
        String title = in.nextLine().toLowerCase();
        in.next();
        System.out.print("Introduce el codigo de " + productType + ": ");
        int codProduct = in.nextInt();

        switch (productType){
            case "dvd":
                productos.add(new DVD(codProduct,title));
                System.out.println("DVD añadido con exito.");
                break;
            case "revista":
                productos.add(new Revistas(codProduct,title));
                System.out.println("Revista añadida con exito.");
                break;
            case "libro":
                productos.add(new Libros(codProduct,title));
                System.out.println("Libro añadido con exito.");
                break;
            default:
                System.out.println("Este producto no existe.");
                break;
        }
    }

    public void findItem(int codProduct){
        for (Producto producto : productos){
            if (producto.getCodProduct() == codProduct){
                System.out.println("Se ha encontrado el item");
                System.out.println(producto);
            } else {
                System.out.println("No se ha encontrado el producto");
            }
        }
    }

    public void removeItem(int codProduct) {

        for (Producto producto : productos) {
            if (producto.getCodProduct() == codProduct){
                productos.remove(producto);
                System.out.println("Se ha borrado el producto con exito");
            } else {
                System.out.println("No se ha encontrado el producto");
            }
        }
    }
}
