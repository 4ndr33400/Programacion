public class Reloj {

    public int hour;
    public int minut;
    public int second;

    public static final int DEFAULT_HOUR = 0;
    public static final int DEFAULT_MINUT = 0;
    public static final int DEFAULT_SECOND = 0;

    public Reloj(int hour, int minut, int second){

        this.hour = hour;
        this.minut = minut;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinut() {
        return minut;
    }

    public int getSecond() {
        return second;
    }

    public void getHourMinutSecond (int hour, int minut, int second , int mode ) {

        if (mode == 24) {
            if (hour >= 24 || hour < 0) {
                this.hour = DEFAULT_HOUR;
            }
        } else if (mode == 12) {
            if (hour >= 12 || hour < 0) {
                this.hour = DEFAULT_HOUR;
            }
        }

        if (minut >= 60 || minut < 0) {
            this.minut = DEFAULT_MINUT;
        } else {
            this.minut = minut;
        }

        if (second >= 60 || minut < 0) {
            this.second = DEFAULT_SECOND;
        } else {
            this.second = second;
        }
    }
    public void showTime(){
        System.out.println(hour + ":" + minut + ":" + second);
    }

}
