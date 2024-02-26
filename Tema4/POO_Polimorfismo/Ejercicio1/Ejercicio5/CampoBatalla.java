package POO_Polimorfismo.Ejercicio1.Ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class CampoBatalla {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    private ArrayList<ICombatiente> ataques;

    public static void main(String[] args) {
        boolean isGameOver = false;
        CampoBatalla campoBatalla = new CampoBatalla();

        int chooseFighter1 = random.nextInt(3);

        int chooseFighter2 = random.nextInt(3);



        do{

        } while(isGameOver);
    }
    public CampoBatalla() {
        ataques = new ArrayList<>();

    }
}
