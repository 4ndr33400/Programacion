import java.sql.SQLOutput;
import java.util.Scanner;
public class MyString {
    static String introducedString;
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Seleccione a continuacion una de las siguientes opciones :");
        System.out.println("(a).Devolver cadena invertida y en mayusculas");
        System.out.print("Introduzca la seleccion :");
        String option = in.next();
        switch(option){
            case "a":
                System.out.println("Introduce la cadena: ");
                introducedString = in.next();
                System.out.println(invertedMayus(introducedString));
                break;
            case "b":
        }
    }
     public static String invertedMayus (String String1){
        String invertedString = "";
        for(int i = String1.length() - 1; i >= 0; i--){
           invertedString = invertedString + String1.charAt(i);
        }
        return invertedString.toUpperCase();
    }
    public static int vowelCount (String String2){
        int counter = 0;
        for(int i = 0 ; i < String2.length() ; i++){
        }
        return counter;
    }
}
