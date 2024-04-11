package Ejercicio1;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class ListaCompra {
    static Scanner in = new Scanner(System.in);
    static Set<String> listaCompra = new HashSet<>();
    public static void main(String[] args) {
        boolean listDone = false;
        do {
            System.out.println("Quiere añadir otro elemento a la lista de la compra?");
            System.out.println("1. Añadir producto" +
                    "\n2. Salir"
            );
            System.out.print("Introduzca la seleccion: ");
            int option = in.nextInt();
            switch (option){
                case 1:
                    addProduct();
                    break;
                case 2:
                    System.out.println("Lista de la compra terminada");
                    listDone = true;
                    break;
            }
        }while (!listDone);
        for (String listaCompleta : listaCompra){
            System.out.println(listaCompleta);
        }
    }
    public static void addProduct(){
        System.out.print("Nombre del producto: ");
        String productName =in.next();
        if (listaCompra.contains(productName)){
            System.out.println("Este producto ya se encuentra en la lista de la compra");
        } else {
            listaCompra.add(productName);
        }
    }
}