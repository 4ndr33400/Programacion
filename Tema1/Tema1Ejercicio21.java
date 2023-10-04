import java.util.Scanner;
public class Tema1Ejercicio21 {
    public static void main (String [] args ){
        Scanner in = new Scanner (System.in);

        System.out.println("A continuacion se van a mostrar todos los numeros pares entre 1 y 1000 sumados ");

        int i = 0;
        int sum = 0;

        while (i <= 1000){

            if (i%2 == 0){ sum=sum+i;
            }i++;
        }System.out.print("atgggth" + sum);
    }
}
