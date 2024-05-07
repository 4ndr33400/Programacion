package Ejercicio2;

import java.util.Date;

public class Funko {
    Date funkoDate;
    double funkoPrice;
    String funkoCode;
    String funkoName;
    String funkoModel;

    public Funko(String funkoCode, String funkoName, String funkoModel, double funkoPrice, Date funkoDate) {
        this.funkoCode = funkoCode;
        this.funkoName = funkoName;
        this.funkoModel = funkoModel;
        this.funkoPrice = funkoPrice;
        this.funkoDate = funkoDate;
    }
}
