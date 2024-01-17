import java.util.Scanner;
public class PruebaReloj {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args){

        System.out.println("Que modo quiere? (12 0 24)");
        int mode = in.nextInt();
        System.out.print("Introduce la hora: ");
        int hour = in.nextInt();
        System.out.print("Introduce los minutos: ");
        int minut = in.nextInt();
        System.out.print("Introduce los segundos: ");
        int second = in.nextInt();

        Reloj reloj = new Reloj(hour,minut,second);
        reloj.setHourMinutSecond(hour,minut,second,mode);
        reloj.showTime();
    }
}
