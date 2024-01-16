import java.util.Scanner;
public class PruebaReloj {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args){

        System.out.print("Introduce la hora: ");
        int hour = in.nextInt();
        System.out.print("Introduce los minutos: ");
        int minut = in.nextInt();
        System.out.print("Introduce los segundos: ");
        int second = in.nextInt();
        Reloj reloj = new Reloj(hour,minut,second);
        reloj.showTime();
    }
}
