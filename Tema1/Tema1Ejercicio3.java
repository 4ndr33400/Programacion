import java.util.Scanner;
public class Tema1Ejercicio3 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

    System.out.println("Introduzca la altura y la base de su triangulo");

    int A = in.nextInt();
    int B = in.nextInt();
    int res=0;

    res = (A*B)/2;

    System.out.println("El perimetro es " + res );
    }
}
