import java.util.Scanner;
import java.util.Random;
public class AtrapaLaMosca {
    static Random random = new Random();
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
    public static int

}
