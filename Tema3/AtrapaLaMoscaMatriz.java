import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMoscaMatriz {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);
    public static int[][] flyPositionCreate(){
        int[][] returnMatrizFly = new int [4][4];
        int lenght = 4;
        int FlyPositionFila = random.nextInt(0,4);
        int FlyPositionColumna = random.nextInt(0,4);
        for (int x = 0; x < returnMatrizFly.length; x++){
            for (int y = 0; y < returnMatrizFly[x].length; y++){
                if (FlyPositionFila == x){
                    returnMatrizFly[x][y] = 1;
                } else {
                    returnMatrizFly[x][y] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(returnMatrizFly));
        return returnMatrizFly;
    }

}
