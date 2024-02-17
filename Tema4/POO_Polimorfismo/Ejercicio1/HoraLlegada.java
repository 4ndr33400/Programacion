package POO_Polimorfismo.Ejercicio1;

public class HoraLlegada {
    public int hour;
    public int minute;
    public int second;

    public HoraLlegada(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
}
