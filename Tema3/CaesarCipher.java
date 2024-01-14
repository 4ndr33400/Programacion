import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Elige una de las siguientes opciones: ");
        System.out.println("\n(a) Encriptar un mensaje." +
                "\n(b) Desencriptar un mensaje.");
        System.out.print("Introduce la seleccion:");
        String option = in.nextLine();
        switch (option) {
            default:
                System.out.println("Esa opcion no es posible");
                break;
            case "a":
                System.out.print("Introduce el mensaje que quieras encriptar: ");
                String decryptedMessage = in.nextLine();
                System.out.println(encrypt(decryptedMessage));
                break;
            case "b":
                System.out.print("Introduce el mensaje que quieras desencriptar: ");
                String encryptedMessage = in.nextLine();
                System.out.println(decrypt(encryptedMessage));
                break;
        }
    }

    public static String encrypt(String decryptedMessage) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < decryptedMessage.length(); i++) {
            char ch = decryptedMessage.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'Z') {
                    encryptedMessage.append('A');
                } else {
                    encryptedMessage.append((char) (ch + 1));
                }
            } else if (Character.isDigit(ch)) {
                if (ch == '9') {
                    encryptedMessage.append('0');
                } else {
                    encryptedMessage.append((char) (ch + 1));
                }
            } else {
                encryptedMessage.append(ch);
            }
        }
        return encryptedMessage.toString();
    }

    public static String decrypt(String encryptedMessage) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char ch = encryptedMessage.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'A') {
                    decryptedMessage.append('Z');
                } else {
                    decryptedMessage.append((char) (ch - 1));
                }
            } else if (Character.isDigit(ch)) {
                if (ch == '0') {
                    decryptedMessage.append('9');
                } else {
                    decryptedMessage.append((char) (ch - 1));
                }
            } else {
                decryptedMessage.append(ch);
            }
        }
        return decryptedMessage.toString();
    }
}