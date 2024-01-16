import java.util.Scanner;

public class Lingo {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido al Lingo");
        System.out.print("Introduce una palabra secreta :");
        String hiddenWord = in.nextLine();
        wordGuess(hiddenWord);
        printHint(hiddenWord);
    }

    public static String printHint(String hiddenWord) {
        String printHiddenWord = "";
        for (int i = 0; i < hiddenWord.length(); i++) {
            System.out.print("-");
        }
        return printHiddenWord;
    }

    public static void wordGuess(String hiddenWord) {
        String userGuess = "";
        int tryNumber = 0;
        do {
            System.out.print("Try: ");
            userGuess = in.nextLine();
            for (int i = 0; i < userGuess.length(); i++) {
                if (userGuess.charAt(i) == hiddenWord.charAt(i)) {
                    System.out.print(userGuess.charAt(i));
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
            tryNumber++;

            if (hiddenWord.equals(userGuess)) {
                System.out.println("Has ganado :D");
                break;
            } else if (tryNumber > 5) {
                System.out.println("Has perdido :(");
                break;
            }
        } while (!hiddenWord.equals(userGuess) || tryNumber <= 5);
    }
}