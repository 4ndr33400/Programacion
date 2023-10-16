import java.util.Scanner;
public class Tema1Ejercicio24 {
    public static void main (String [] arg){
        Scanner in = new Scanner (System.in);


        System.out.println("Introduce your students' marks");


        Double grade =in.nextDouble();
        int pass =0;
        int student =0;
        int fail =0;
        String N ="p";
        boolean  end = false;

        while (end != true ) {

            if (grade <= 5 && grade >= 10) {

                System.out.println("Introduce the next poor souls' mark or write stop");
                N=in.nextLine();
                pass++;
                student++;

            } else if (grade < 5 && grade >= 10) {

                System.out.println("Introduce the next poor souls' mark or write stop");
                N=in.nextLine();
                fail++;
                student++;

            } else if (grade < 0 && grade > 10) {
                System.out.println("And you call your self a teacher huh ?");
            }
            if ("stop".equals(N) ) {
                end = true;
            }
        }
        System.out.println("These students passed the exams " + pass + " and these poor fools failed on combat R.I.P " + fail);


    }
}
