import java.sql.SQLOutput;
import java.util.Scanner;
public class MyString {
    static String introducedString;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seleccione a continuacion una de las siguientes opciones :");
        System.out.println("(a) Devolver cadena invertida y en mayusculas" +
                "\n(b) Contar las vocales de la cadena" +
                "\n(c) Cual es la palabra mas larga de la cadena ");
        System.out.print("Introduzca la seleccion :");
        String option = in.nextLine();
        System.out.println("Introduce la cadena: ");
        switch (option) {
            case "a":
                introducedString = in.nextLine();
                System.out.println(invertedMayus(introducedString));
                break;
            case "b":
                introducedString = in.nextLine();
                System.out.println("Hay " + vowelCount(introducedString) + " vocales");
                break;
            case "c":
                introducedString = in.nextLine();
                System.out.println("La palabra mas larga es : " + greatestLength(introducedString) );
                break;
        }
    }

    public static String invertedMayus(String string1) {
        String invertedString = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            invertedString = invertedString + string1.charAt(i);
        }
        return invertedString.toUpperCase();
    }

    public static int vowelCount(String string2) {
        int vowelCounter = 0;
        for (int i = 0; i < string2.length(); i++) {
            if (string2.charAt(i) == 'a' || string2.charAt(i) == 'e' || string2.charAt(i) == 'i' || string2.charAt(i) == 'o' || string2.charAt(i) == 'u') {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }

    public static String greatestLength(String string3) {
        String[] words = string3.split(" ");
        String greatestWord = "";
        for (String word : words) {
            if (word.length() > greatestWord.length()) {
                greatestWord = word;
            }
        }
        return greatestWord;
    }

}
