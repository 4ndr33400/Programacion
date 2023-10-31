package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio10 {
    public static void main (String [] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elije entre : \n 1. Mostrar el signo del numero introducido por el usuario \n 2. Validador de edad \n 3. Calculador de area y perimetro del circulo \n 4. Conversor de dinero \n 5. Mostrar la tabla de multiplicar de un numero \n 6. Mostrar la tabla de multiplicar de los numeros del 1 - 10 \n 7. Validador de numeros primos \n 8. Validador de fechas \n 9. Constructor de piramides ");

        int choose = in.nextInt();

        switch (choose) {
            case 1: {
                Tema2Ejercicio1.main(arg);
                int i = in.nextInt();
                Tema2Ejercicio1.numberSign(i);
                break;
            }
            case 2: {
                Tema2Ejercicio2.main(arg);
                int age = in.nextInt();
                Tema2Ejercicio2.isAdult(age);
                break;
            }
            case 3: {
                Tema2Ejercicio3.main(arg);
                double rad = in.nextDouble();
                Tema2Ejercicio3.calculateCircleArea(rad);
                Tema2Ejercicio3.calculateCirclePerimeter(rad);
                break;
            }
            case 4: {
                Tema2Ejercicio4.main(arg);
                Tema2Ejercicio4.showMenu();
                    double eur = in.nextDouble();
                   Tema2Ejercicio4.dollar2euro(eur);
                    double doll = in.nextDouble();
                    Tema2Ejercicio4.euro2dollar(doll);
                break;
            }
            case 5: {
                int numero;
                System.out.print("Introduce el numero del que desees ver las tablas de multiplicar :");
                numero = in.nextInt();
                Tema2Ejercicio5.tablas(numero);
                break;
            }
            case 6 : {
                Tema2Ejercicio6.main(arg);
                int numero = in.nextInt();
                Tema2Ejercicio5.tablas(numero);
                break;
            }
            case 7: {
                int Numero = 1;
                System.out.println("A continuacion introduce los numeros que desee identificar como primos");
                while (Numero != 0){
                    Numero = in.nextInt();
                    Tema2Ejercicio7.esPrimo(Numero);
                    if (Numero == 0){
                        System.out.println("Bye bye");
                        break;
                    }
                }
                break;
            }
            case 8 :{
                int dias = 0;
                int mes = 0;
                int año = 0;
                System.out.print("Introduce los dias:");
                dias = in.nextInt();
                System.out.print("Introduce el mes :");
                mes = in.nextInt();
                System.out.print("Introduce el año: ");
                año= in.nextInt();

                Tema2Ejercicio8.Dias_Mes(mes,dias,año);
                break;
            }
            case 9 :{
                System.out.print("Introduce el numero de lineas que deseas para tu piramide :");
                int linea = in.nextInt();
                System.out.print("Introduce el caracter con el que desees construir la piramide :");
                String caracter = in.next();

                Tema2Ejercicio9.Piramide(linea,caracter);
                break;
            }
        }
    }
}
