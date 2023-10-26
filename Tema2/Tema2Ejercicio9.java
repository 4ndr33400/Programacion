import java.util.Scanner;
public class Tema2Ejercicio9 {
    public static void Piramide (int linea, String caracter){
        int espacios = linea;

        for (int cantidad = 1; cantidad <= (2 * linea); cantidad += 2 ){
            System.out.println(" ".repeat(espacios) + caracter.repeat(cantidad));
            espacios--;
        }
    }
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el numero de lineas que deseas para tu piramide :");
        int linea = in.nextInt();
        System.out.print("Introduce el caracter con el que desees construir la piramide :");
        String caracter = in.next();

        Piramide(linea,caracter);
    }
}
