import java.util.Scanner;
public class Tema2Ejercicio5 {
    public static void tablas (int number) {
        int multiplier =0;
        int result = 0;
        while (multiplier < 11){
            System.out.println(number + "*" + multiplier +" = " + result);
            multiplier ++;
            result = number * multiplier ;
        }
    }
    public static void main (String [] args){
        Scanner boring = new Scanner (System.in);
        int number;
        System.out.print("Introduce the number whom you wanna see the multiplication tables :");
        number = boring.nextInt();
        tablas(number);


    }
}

