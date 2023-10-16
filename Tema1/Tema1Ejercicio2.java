import java.util.Scanner;
public class Tema1Ejercicio2 {
    static public void main (String [] arg){
        Scanner in = new Scanner (System.in);

        System.out.println ("Introduce el Largo del rectangulo");
        int largo = in.nextInt();
        System.out.println ("Introduce el Ancho del rectangulo");
        int ancho = in.nextInt();

        int resS = 0;
        int resP = 0;

        resS = largo * ancho;
        resP = (largo *2) + (ancho *2);

        System.out.println ("El perimetro del rectangulo es " + resP + " y la superficie es " + resS);
    }
    
}
