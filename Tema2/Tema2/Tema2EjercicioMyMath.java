package Tema2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Tema2EjercicioMyMath {
    public static void showMenu(){
        System.out.println("Choose between these : ");
        System.out.println("" +
                   "1.Calculate the area and perimeter of a square, rectangle or circle " +
                "\n2.Test if the number is prime." +
                "\n3.How many digits does your number have." +
                "\n4.How many even digits does your number have." +
                "\n5.How many odd digits does your number have." +
                "\n6.Calculate the factorial of a number in a recursive way." +
                "\n7.Calculate a Quadratic Equation." +
                "\n8.Add up all the digit of the number of your choice.");
    }
    public static void main (String[]args){
        Scanner test = new Scanner (System.in);

        showMenu();
        int choice = test.nextInt();

        switch (choice){
            case 1:
                System.out.println("Choose in between these: ");
                System.out.println("1.Calculate a square.\n2.Calculate a rectangle.\n3.Calulate a circle." );
                int choice_case1 = test.nextInt();
                if (choice_case1 == 1) {
                    System.out.print("Introduce your square's side lenght : ");
                    double lenght_side_square = test.nextDouble();
                    System.out.println("Your square's perimeter is " + MyMath.squarePerimeter(lenght_side_square) + " and the area is " + MyMath.squareArea(lenght_side_square));
                } else if (choice_case1 == 2){
                    System.out.print("Introduce your rectangle's large lenght :");
                    double large_rectangle = test.nextDouble();
                    System.out.print("Introduce your rectangle's wide lenght :");
                    double wide_rectangle = test.nextDouble();
                    System.out.println("Your rectangle's perimeter is " + MyMath.rectanglePerimeter(large_rectangle,wide_rectangle) + " and the area is " + MyMath.rectangleArea(large_rectangle,wide_rectangle));
                } else if (choice_case1 == 3){
                    System.out.print("Introduce your circle's radius :");
                    double circle_radius = test.nextDouble();
                    System.out.println("Your circle's perimeter is " + MyMath.circlePerimeter(circle_radius) + " and the area is " + MyMath.circleArea(circle_radius));
                } else if  (choice_case1 > 3 || choice_case1 <= 0){
                    System.out.println("Arent we too grown for this shit? \uD83D\uDE10");
                }
                break;
            case 2 :
                System.out.print("Introudce a number to know if it's prime : ");
                int number_prime = test.nextInt();
                System.out.println("Is it a prime number? " + MyMath.isPrime(number_prime));
                break;
            case 3 :
                System.out.print("Introudce a number to know how many digits it has :");
                int number_count = test.nextInt();
                System.out.println("This number has " + MyMath.figureCount(number_count) + " digits.");
                break;
            case 4 :
                System.out.print("Introudce a number to know how many even digits it has : ");
                int even_number = test.nextInt();
                System.out.println("The number " + even_number + " has " + MyMath.evenFigureCount(even_number) + " even digits.");
                break;
            case 5:
                System.out.print("Introudce a number to know how manu odd digits it has : ");
                int odd_number = test.nextInt();
                System.out.println("The number " + odd_number + " has " + MyMath.oddFigureCount(odd_number) + " odd digits.");
                break;
            case 6:
                System.out.print("Introduce a number to know the factorial :");
                int factorial_number = test.nextInt();
                System.out.println("The factorial is " + MyMath.factorialRecursive(factorial_number));
                break;
            case 7:
                System.out.print("Introduce the value of a :");
                int a = test.nextInt();
                System.out.print("Introduce the value of b :");
                int b = test.nextInt();
                System.out.print("Introduce the value of c :");
                int c = test.nextInt();
                System.out.println("The ecuation you choosed was : "+ b + " * 2 - 4 * " + a +" * "+ c);
                System.out.println("There are " + MyMath.quadraticEcuationSolutions(a,b,c) + " solutions to that equation.");
                break;
            case 8:
                System.out.print("Introduce a number to see the result to the sumatory of each");
                int number = test.nextInt();
                System.out.println("The sumatory is : " +MyMath.figuresSumatory(number));
                break;
        }
    }
}
