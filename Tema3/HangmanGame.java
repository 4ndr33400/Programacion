import java.util.Scanner;

public class HangmanGame {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego del 'Ahorcado'");
        mainGame(ask4Word());

    }

    public static String ask4Word() {
        System.out.print("Introduzca la palabra secreta:");
        String secretWord = in.nextLine();
        return secretWord;
    }

    public static void showHangman(int numberErrors) {
        if (numberErrors == 1){
            System.out.println("  " +
                    "+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========");
        } else if (numberErrors == 2){
            System.out.println(" " +
                    "+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");

        } else if (numberErrors == 3){
            System.out.println(" " +
                    "+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");

        }else if (numberErrors == 4){
            System.out.println(" " +
                    "+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
        }else if (numberErrors == 5){
            System.out.println(" " +
                    "+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
        }else if (numberErrors == 6){
            System.out.println(" " +
                    "+---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
        } else if (numberErrors == 0){
            System.out.println("  " +
                    "+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "=========");
        }
    }

    public static String mainGame(String secretWord) {
        boolean victory = false;
        String revealWord = "";
        int errors = 0;
        int numberTry = 0;
        while (numberTry < 6  && !victory) {
            System.out.print("Introduce una letra:");
            String wordGuess = in.next();


            if (secretWord.contains(wordGuess)) {
                System.out.println("Has acertado una letra!");
                revealWord += wordGuess;
            } else {
                System.out.println("No has acertado la letra :(");
                errors++;
            }

            if (secretWord.equals(revealWord)){
                System.out.println("Has ganado!");
                break;
            } else if (numberTry >= 6){
                System.out.println("Se han agotado tus intentos");
                break;
            }
            showHangman(errors);
            numberTry++;
        }
        return revealWord;
    }
}
