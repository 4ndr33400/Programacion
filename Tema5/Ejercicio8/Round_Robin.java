package Ejercicio8;
import java.util.LinkedList;
import java.util.List;

public class Round_Robin {

    static List<Procesos> simulator = new LinkedList<>();

    public static void main(String[] args) {
        int timePassed = 0;
        do {
            if (timePassed == 2){
                createProcess();
            }

            if (timePassed > 2){
                timePassed = 0;
            }
            timePassed++;
        }while (!simulator.isEmpty());
    }
    public static void createProcess(){
        int quantum = 0;
        String identifier = " ";
        simulator.add(new Procesos(quantum,identifier));
    }
    public static void informSituation(){

    }

}