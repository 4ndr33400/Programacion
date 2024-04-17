package Ejercicio6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class AcortadorURL {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    static Map<String,String> url = new HashMap<>();
    public static void main(String[] args) {
        boolean isDone = false;
        do {
            switch(menu()){
                case 1:
                    createKey();
                    break;
                case 2:
                    findUrl();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }

        }while(!isDone);
    }
    public static int menu(){
        System.out.println("1. Crea un nuevo registro." +
                "\n2. Resuelve la direccion." +
                "\n3. Borra un registro." +
                "\n4. Mostrar todos los registros.");
        System.out.print("Introduce la seleccion: ");
        int option = in.nextInt();
        return option;
    }
    public static void createKey(){
        System.out.print("Introduce la url para poder crer una clave: ");
        String inputUrl = in.next();
        String key = generateKey();
        url.put(key,inputUrl);
        System.out.println("Url: " + inputUrl +
                "\nClave: " + key);
    }
    public static String generateKey() {
        char[] caracteres = new char[6];
        for (int i = 0; i < 6; i++) {
            caracteres[i] = (char) (random.nextInt(26) + 'a');
        }
        return new String(caracteres);
    }
    public static void findUrl(){

    }
}
