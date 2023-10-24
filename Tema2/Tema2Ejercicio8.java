import java.util.Scanner;
public class Tema2Ejercicio8 {
    public static boolean Dias_Mes (int mes,int dias){
        if (mes > 0 && mes < 13) {
            if (mes == 1 || mes == 3 || mes ==  5 || mes== 7 || mes == 8 || mes == 10 || mes == 12 && dias <= 31){
                System.out.println ("El dia y el mes son correctos");
            } else if (mes == 2 ||mes == 4 ||mes == 6 ||mes == 9 ||mes == 11 && dias <= 30){
                System.out.println("El dia y el mes son correctos");
            }
        } else {
            return false;
        }
        return true;
    }
    public static boolean Año (int año){
        año = 0;
        int dias =0;
        int mes =0;
        if (año % 2 == 0 && mes==2 && dias <= 29){
            System.out.println("El año es correcto");
        }
        return true;
    }
    public static void main (String [] args){
        Scanner guagua = new Scanner (System.in);
        int dias = 0;
        int mes = 0;
        int año = 0;

        System.out.print("Introduce los dias:");
        dias = guagua.nextInt();
        System.out.print("Introduce el mes :");
        mes = guagua.nextInt();
        System.out.print("Introduce el año: ");
        año=guagua.nextInt();

        Dias_Mes(dias,mes);
        Año(año);

    }
}
