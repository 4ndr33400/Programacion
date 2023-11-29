import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class AtrapaLaMosca {
    static Random random = new Random();
    static Scanner in =new Scanner(System.in);
    public static int[] flyPositionCreate(){
        int [] returnArrayFly = new int[15];
        int length = 15;
        int flyPosition = random.nextInt(0,14);
        for (int i = 0; i < length ; i++){
            if (flyPosition == i){
                returnArrayFly[i] = 1;
            }else {
                returnArrayFly[i] = 0;
            }
        }
        return returnArrayFly;
    }
    public static void CachTheFly (int[] Array){
        System.out.println("Donde crees que esta la mosca? ");
        int eleccion = in.nextInt();
        int[] FlyElection = flyPositionCreate();
        int count = 0;
        do {
            for (int i = 0; i < FlyElection.length; i++) {
                if (eleccion == FlyElection[i]) {
                    System.out.println("Le has dado a la mosca :D ya puedes dormir en paz ijijijijjiji");
                    count++;
                    break;
                } else if ((eleccion + 1) == FlyElection[i]) {
                    System.out.println("Estuviste a punto de matar a la mosca");
                    flyPositionCreate();
                    continue;
                } else if (eleccion != FlyElection[i]) {
                    System.out.println("Vuelve a intentarlo");
                    continue;
                }
            }
        }while (count <= 0);
    }
    public static void main(String[] args){
        System.out.println("Bienvenido/a al juego de la mosca " +
                "\n En este juego tendras que elegir un numero de entre el 0 y el 15, si el numero que elejiste esta cerca de la mosca esta se movera de posicion, " +
                "y si no lo esta la mosca permanecera en su sitio. Buena suerte!");
        System.out.print("Introduce next para continuar :");
        String next = in.nextLine();

        flyPositionCreate();
        int[] FlyArray = flyPositionCreate();
        CachTheFly(FlyArray);

    }
}
