import java.util.Scanner;

public class CaesarCipher {
    static Scanner in = new Scanner(System.in);
    public static void main (String [] args){
        menu();
        String option = in.nextLine().toLowerCase();
        switch(option){
            case "a":
                System.out.println("Introduzca el mensaje a encriptar");
                String dencryptedMessage = in.nextLine();
                System.out.println(encryptMessage(dencryptedMessage));

            case "b":
        }


    }
    public static void menu(){
        System.out.println("Elige una de las siguientes funciones:" +
                "\n (a) Para encriptar un mensaje" +
                "\n (b) Para desencriptar un mensaje");
        System.out.print("Introduzca la seleccion :");
    }
    public static int encryptMessage(String decryptedMessage){

        int asciiValue = 0;
        for(int i = 0; i < decryptedMessage.length(); i++){
            asciiValue = (int) decryptedMessage.charAt(i);
        }
        for (int x = 0; x < decryptedMessage.length();x++){
            asciiValue = (int) decryptedMessage.charAt(x);
        }
        return asciiValue;
    }
}
