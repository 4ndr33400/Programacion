package Ejercicio5;
public class Avistamientos {
    int timeDay;

    public Avistamientos(int timeDay) {
        this.timeDay = timeDay;
    }

    public int getTimeDay() {
        return timeDay;
    }

    @Override
    public String toString() {
        return "Hora del avistamiento: " + getTimeDay();
    }
}
