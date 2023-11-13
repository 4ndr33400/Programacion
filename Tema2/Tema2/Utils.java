package Tema2;

public class Utils {

    public static double miles2kilometers(double get_miles) {
        return get_miles * 1.60934;
    }

    public static double getTaxes(double get_euro, double get_percentage) {
        double result = get_euro * (get_percentage / 100);
        return Math.round(result * 100) / 100.0;
    }

    public static double getNetPrice(double get_euro, double get_percent) {
        double apply_taxes = getTaxes(get_euro, get_percent) + get_euro;
        return Math.round(apply_taxes * 100) / 100.0;
    }

    public static double getCoins(double euros) {
        double amount_coin = 0;
        while (0 != euros) {
            if (euros > 2) {
                amount_coin += 10000000;
                euros = euros - 2;
            } else if (euros > 1) {
                amount_coin += 1000000;
                euros = euros - 1;
            } else if (euros > 0.50) {
                amount_coin += 100000;
                euros = euros - 0.50;
            } else if (euros > 0.20) {
                amount_coin += 10000;
                euros = euros - 0.20;
            } else if (euros > 0.10) {
                amount_coin += 1000;
                euros = euros - 0.10;
            } else if (euros > 0.05) {
                amount_coin += 100;
                euros = euros - 0.05;
            } else if (euros > 0.02) {
                amount_coin += 10;
                euros = euros - 0.02;
            } else if (euros > 0.009) {
                amount_coin += 1;
                euros = euros - 0.009;
            } else {
                break;
            }
        }
        return amount_coin;
    }

    public static int getNIF(int numberNIF) {
        int result = 0;
        numberNIF = numberNIF % 23;

        switch (numberNIF) {
            case 0:
                result = 'T';
                break;
            case 1:
                result = 'R';
                break;
            case 2:
                result = 'W';
                break;
            case 3:
                result = 'A';
                break;
            case 4:
                result = 'G';
                break;
            case 5:
                result = 'M';
                break;
            case 6:
                result = 'Y';
                break;
            case 7:
                result = 'F';
                break;
            case 8:
                result = 'P';
                break;
            case 9:
                result = 'D';
                break;
            case 10:
                result = 'X';
                break;
            case 11:
                result = 'B';
                break;
            case 12:
                result = 'N';
                break;
            case 13:
                result = 'J';
                break;
            case 14:
                result = 'Z';
                break;
            case 15:
                result = 'S';
                break;
            case 16:
                result = 'Q';
                break;
            case 17:
                result = 'V';
                break;
            case 18:
                result = 'H';
                break;
            case 19:
                result = 'L';
                break;
            case 20:
                result = 'C';
                break;
            case 21:
                result = 'K';
                break;
            case 22:
                result = 'E';
                break;
        }
        return Character.toUpperCase(result);
    }

    public static boolean isValidNIF(int number, char nif) {
        nif = Character.toUpperCase(nif);
        return nif == getNIF(number);
    }
}

