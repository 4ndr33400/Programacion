import java.util.Scanner;
public class Tema2Ejercicio10 {
    public static void main (String [] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elije entre : \n 1. Mostrar el signo del numero introducido por el usuario \n 2. Validador de edad \n 3. Calculador de area y perimetro del circulo \n 4. Conversor de dinero \n 5. Mostrar la tabla de multiplicar de un numero \n 6. Mostrar la tabla de multiplicar de los numeros del 1 - 10 \n 7. Validador de numeros primos \n 8. Validador de fechas \n 9. Constructor de piramides ");

        int choose = in.nextInt();

        switch (choose) {
            case 1: {
                System.out.print("Introduce un numero para saber si es negativo, positivo o cero :");
                int i = in.nextInt();
                Tema2Ejercicio1.num(i);
                break;
            }
            case 2: {
                System.out.println("Introduce la edad");
                int age = in.nextInt();
                if (Tema2Ejercicio2.isAdult(age)) System.out.println("Your 'baby' should b payin bills by now");
                else {
                    System.out.println("I hate toddlers");
                    break;
                }
            }
            case 3: {
                Tema2Ejercicio3.validRadius();
                System.out.print("Introduce el radio de tu circulo :");
                double rad = in.nextDouble();
                System.out.println("El area del circulo es " + Tema2Ejercicio3.calculateCircleArea(rad));
                System.out.println("El perimetro del circulo es " + Tema2Ejercicio3.calculateCirclePerimeter(rad));
                break;
            }
            case 4: {
                Tema2Ejercicio4.showMenu();
                int eleccion =in.nextInt();
                if (eleccion == 1) {
                    System.out.print("Introduce la cantidad de dolares que quieras convertir a euros: ");
                    double eur = in.nextDouble();
                    System.out.println("Tienes " + Tema2Ejercicio4.dollar2euro(eur) + " euros");
                } else if (eleccion == 2)
                    System.out.print("Introduce los euros que quieras convertir a dolares : ");
                    double doll = in.nextDouble();
                System.out.println("Tienes " + Tema2Ejercicio4.euro2dollar(doll) + " dolares");
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
                int numero =1;
                System.out.println("Introduce n para ver todas la tablas de multiplicar del 1 - 10");
                while (numero < 11 ){
                    Tema2Ejercicio6.tables(numero);
                    numero++;
                }
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
