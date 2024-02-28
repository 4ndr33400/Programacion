package POO_Polimorfismo.Ejercicio1.Ejercicio6;
import POO_Polimorfismo.Ejercicio1.Ejercicio5.Bardo;
import POO_Polimorfismo.Ejercicio1.Ejercicio5.Berserker;
import POO_Polimorfismo.Ejercicio1.Ejercicio5.Guerrero;
import POO_Polimorfismo.Ejercicio1.Ejercicio5.ICombatiente;

import java.util.ArrayList;
import java.util.Random;
public class CampoBatalla {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<ICombatiente> combatientes = new ArrayList<>();
        addFighters(combatientes);

        do {


        }while(combatientes.size() > 1);
    }
    public static ArrayList<ICombatiente> addFighters(ArrayList<ICombatiente> combatientes) {
    ICombatiente combatiente = null;
    int numberFighter = 0;
    do {
        int randomNumber = random.nextInt(3);
        switch (randomNumber){
            case 1:
                combatiente = new Berserker();
            case 2:
                combatiente = new Bardo();
            case 3:
                combatiente = new Guerrero();
        }
        combatientes.add(combatiente);
        numberFighter++;
    }while(numberFighter < 50);
        return combatientes;
    }
}
