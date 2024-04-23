package Ejercicio8;
import java.util.Random;

public class Procesos {
    double timeProcess;
    String name;
    private final double DEFAULT_WORK_PROCESS_TIME = 0.2;
    static Random random = new Random();

    public Procesos(int timeProcess, String name) {
        this.setName(name);
        this.setTimeProcess(timeProcess);
    }

    public void setTimeProcess(int timeProcess) {
        timeProcess = random.nextInt(1,4);
        this.timeProcess = timeProcess;
    }

    public void setName(String name) {
        name = "p" + random.nextInt(1,4);
        this.name = name;
    }
   public void executeProcess(){
        timeProcess = timeProcess - DEFAULT_WORK_PROCESS_TIME;
    }
}