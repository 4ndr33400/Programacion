import java.util.Scanner;
public class MyString {
    static String introducedString;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seleccione a continuacion una de las siguientes opciones :");
        System.out.println("(a) Devolver cadena invertida y en mayusculas." +
                "\n(b) Contar las vocales de la cadena." +
                "\n(c) Cual es la palabra mas larga de la cadena. " +
                "\n(d) Contar el numero de veces que la segunda cadena aparece en la primera. " +
                "\n(e) Contar el numero de palabras que tiene una cadena." +
                "\n(f) Pasar un numero de telefono al formato." +
                "\n(g) Mostrar el historiograma de las vocales de la cadena.");
        System.out.print("Introduzca la seleccion :");
        String option = in.nextLine().toLowerCase();
        System.out.print("Introduce la cadena: ");
        switch (option) {
            case "a":
                introducedString = in.nextLine();
                System.out.println(invertedMayus(introducedString));
                break;
            case "b":
                introducedString = in.nextLine();
                System.out.println("Hay " + vowelCount(introducedString) + " vocales.");
                break;
            case "c":
                introducedString = in.nextLine();
                System.out.println("La palabra mas larga es : " + greatestLength(introducedString) + ".");
                break;
            case "d":
                introducedString = in.nextLine();
                System.out.print("Introduce la segunda cadena :");
                String introducedString2 = in.nextLine();
                System.out.println("La segunda cadena aparece : " + numberTimesIncluded(introducedString,introducedString2));

            case "e":
                introducedString = in.nextLine();
                System.out.println("Hay " + wordCount(introducedString) + " palabras.");
            case "f":
                introducedString = in.nextLine();
                System.out.println(convert2Format(introducedString));
            case "g":
                introducedString = in.nextLine();
                vowelsHistoriogram(introducedString);
        }
    }

    public static String invertedMayus(String string1) {
        String invertedString = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            invertedString = invertedString +
                    string1.charAt(i);
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

    public static int numberTimesIncluded(String string4, String string5){
        int timesRepeat = 0;
        for(int i = 0; i < string4.length();i++){
            if (string4.startsWith(string5,i)){
                timesRepeat++;
            }
        }
        return timesRepeat;
    }

    public static int wordCount(String string5){
        string5.trim();
        int word = 1;
        for (int i =0; i < string5.length(); i++){
            if (string5.charAt(i) == ' '){
                word++;
            }
        }
        return word;
    }
    public static String convert2Format (String string6){
        if(string6.length() == 11) {
            string6 = String.format("(+%s)-%s-%s", string6.substring(0, 2), string6.substring(3, 6), string6.substring(7, 11));
        } else {
            string6 = "Numero incorrecto";
        }
        return string6;
    }
    public static void vowelsHistoriogram (String string7){

        int aVowel = 0;
        int eVowel = 0;
        int iVowel = 0;
        int oVowel = 0;
        int uVowel = 0;

        for(int i = 0; i < string7.length();i++){
            if (string7.charAt(i) == 'a'){
                aVowel++;
            } else if (string7.charAt(i) == 'e'){
                eVowel++;
            } else if (string7.charAt(i) == 'i'){
                iVowel++;
            } else if (string7.charAt(i) == 'o'){
                oVowel++;
            } else if (string7.charAt(i) == 'u'){
                uVowel++;
            }
        }
        System.out.println("A: " +aVowel +
                "\nE: " + eVowel +
                "\nI: " + iVowel +
                "\nO: " + oVowel +
                "\nU: " + uVowel);
    }

}
