import java.util.Scanner;
public class Tema1Ejercicio15 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

    System.out.println ("Introduce el año");
    int A = in.nextInt();

    System.out.println("Introduce el mes");
    int month = in.nextInt();

    int dia = 0;

    if ( month==1 || month==3 || month==5 || month== 7 || month == 8 || month == 10 || month == 12) {

        dia = 31;
    } else if (month==2 || month==4 || month==6 || month== 9 || month == 11) {

        if(A%4 == 0 && month ==2 ){
        dia= 29;

        }else  dia = 30;

    }
    System.out.println("El numero de dias de el mes son " + dia);


    }



}

