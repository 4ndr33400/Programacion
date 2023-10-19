import java.util.Scanner;
public class Tema1Ejercicio24 {
    public static void main (String [] arg){
        Scanner in = new Scanner (System.in);

        int pass= 0;
        int fail= 0;
        int students = 0;
        System.out.println("Introduce your students marks");

        float notas;
        String stop = "off";

        do {
            notas= in.nextFloat();
            if (notas>=0 && notas<5 ) {
                //Escribe next, dale al Intro del teclado y escribe otro numero :)
                System.out.println("Type Continue and introduce another students mark or type stop");
                fail++;
                students++;
            }
            if ((notas>=5) && (notas<=10)) {
                System.out.println("Type Continue and introduce another students mark or type stop");
                pass++;
                students++;
            }
            if (notas<0 || notas>10){
                System.out.println("Someone is accepting brides huh");
                break;
            }
            stop =in.nextLine();
            stop =in.nextLine();
        }while (!stop.equals("stop"));

        System.out.println ("Out these "+students+ " students "+" these students passed the exam " + pass + " and these poor souls failed on combat R.I.P :( " + fail);
    }
}
