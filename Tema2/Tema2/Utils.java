package Tema2;

import java.sql.SQLOutput;

public class Utils{

    public static double miles2kilometers (double get_miles){
        return get_miles * 1.60934;
    }

    public static double getTaxes(double get_euro, double get_percentage){
        double result = get_euro * (get_percentage/100);
        return Math.round(result * 100)/100.0;
    }

    public static double getNetPrice (double get_euro, double get_percent){
       double apply_taxes = getTaxes(get_euro,get_percent) + get_euro;
       return Math.round(apply_taxes * 100)/100.0;
    }

    public static double getCoins (double getValue){
        double amount_coin = 0;
        while (getValue != 0){
            if (getValue > 2){
                amount_coin += 10000000;
            } else if (getValue > 1){
                amount_coin += 1000000;
            } else if (getValue > 0.50){
                amount_coin += 100000;
            } else if (getValue > 0.20) {
                amount_coin += 10000;
            } else if (getValue > 0.10){
                amount_coin += 1000;
            } else if (getValue > 0.5){
                amount_coin += 100;
            }
        }

        return amount_coin;
    }

}
