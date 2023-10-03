import java.util.Scanner;
public class Tema1Ejercicio19 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);

System.out.println ("A continuacion se van a mostrar todos los numeros pares del 1 al 1000");

        int i = 0;

        while (i <=1000 ){
            if (i%2 == 0){  System.out.println (i);
            }i++;
        }
    }
}
