package POO_3.Ejercicio3;
import java.util.Scanner;
public class PruebaFigura2D {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Seleccione a continuacion: " +
                "\n1. Cuadrado" +
                "\n2. Rectangulo" +
                "\n3. Circulo" +
                "\n4. Triangulo");
        System.out.print("Introduzca la seleccion: ");
        int option = in.nextInt();
        switch (option){
            case 1:
                System.out.print("Introduce el lado del cuadrado: ");
                double sideSquare = in.nextDouble();
                Cuadrado cuadrado = new Cuadrado(sideSquare);
                System.out.println(cuadrado);
                break;
            case 2:
                System.out.print("Introduce el largo del rectangulo: ");
                double longRectangle = in.nextDouble();
                System.out.print("Introduce el ancho del rectangulo: ");
                double widthRectangle = in.nextDouble();
                Rectangulo rectangulo = new Rectangulo(widthRectangle,longRectangle);
                System.out.println(rectangulo);
                break;
            case 3:
                System.out.print("Introduce el radio del circulo: ");
                double radius = in.nextDouble();
                System.out.print("Introduce el diametro del circulo: ");
                double diameter = in.nextDouble();
                Circulo circulo = new Circulo(diameter,radius);
                System.out.println(circulo);
                break;
            case 4:
                System.out.print("Introduce la base del triangulo: ");
                double baseTriangle = in.nextDouble();
                System.out.print("Introduce la altura del triangulo: ");
                double heightTriangle = in.nextDouble();
                System.out.print("Introduce un lado: ");
                double sideTriangle1 = in.nextDouble();
                System.out.print("Introduce el otro lado: ");
                double sideTriangle2 = in.nextDouble();
                Triangulo triangulo = new Triangulo(baseTriangle,heightTriangle,sideTriangle1,sideTriangle2);
                System.out.println(triangulo);
                break;
            default:
                System.out.println("._.");
                break;

        }
    }
}
