package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio8 {
    public static boolean Dias_Mes (int mes,int dias, int año) {
        boolean ValidYear = false;
        if (mes > 0 && mes < 13) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dias <= 31) {
                ValidYear = true;
            } else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11 && dias <= 30) {
                if ((año % 4 == 0 && mes == 2 && dias <= 29) || (mes == 2 && dias == 28)) {
                    ValidYear = true;
                }
                ValidYear = true;
            }
        }
        return ValidYear;
    }
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int dias = 0;
        int mes = 0;
        int año = 0;

        System.out.print("Introduce los dias:");
        dias = in.nextInt();
        System.out.print("Introduce el mes :");
        mes = in.nextInt();
        System.out.print("Introduce el año: ");
        año= in.nextInt();

        Dias_Mes(mes,dias,año);
    }
}
