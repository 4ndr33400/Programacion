import java.util.Scanner;
public class Tema2Ejercicio6 {
    public static void tables (int number){
        int  multiplier =0;
        int result = 0;
        while (multiplier < 11){
            System.out.println(number + "*" + multiplier +" = " + result);
            multiplier ++;
            result = number * multiplier ;

        }
    }
    public static void main (String [] args){
        Scanner haha = new Scanner (System.in);
        int number =1;
        System.out.println("Introduce n to see all em tables from 1 to 10");
        while (number < 11 ){
            tables(number);
            number++;

        }
    }
}
