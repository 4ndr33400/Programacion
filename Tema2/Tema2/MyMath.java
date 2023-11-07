package Tema2;

import java.sql.SQLOutput;

public class MyMath {
    public static double squarePerimeter(double length_side_square) {
        double result = 0;
        if (length_side_square > 0) {
           result = length_side_square * 4;
        }
        return result;
    }

    public static double squareArea(double length_side_square) {
        double result = 0;
        if (length_side_square > 0) {
            result = length_side_square * length_side_square;
        }
        return result;
    }

    public static double rectanglePerimeter(double large_rectangle, double wide_rectangle) {
        double result = 0;
        if (large_rectangle > 0 && wide_rectangle > 0) {
            result = (2 * large_rectangle) + (2 * wide_rectangle);
        }
        return result;
    }

    public static double rectangleArea(double large_rectangle, double wide_rectangle) {
        double result = 0;
        if (large_rectangle > 0 && wide_rectangle > 0) {
            result = large_rectangle * wide_rectangle;
        }
        return result;
    }

    public static double circlePerimeter(double circle_radius) {
        double result = 0;
        if (circle_radius > 0) {
            result = 2* Math.PI * circle_radius;
        }
        return result;
    }

    public static double circleArea(double circle_radius) {
        double result = 0;
        if (circle_radius > 0) {
            result = Math.PI * (circle_radius * circle_radius);
        }
        return result;
    }

    public static boolean isPrime(int number_prime) {
        boolean esPrimo = true;
        if (number_prime < 2) {
            esPrimo = false;
        } else {
            for (int divisor = 2; divisor < number_prime; divisor++) {
                if (number_prime % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        return esPrimo;
    }

    public static boolean isNotPrime(int number_prime) {
        return !isPrime(number_prime);
    }

    public static int figureCount(int number_count) {
        int digits = 0;
        if (number_count == 0) {
            digits++;
        }
        while (number_count != 0) {
            number_count = number_count / 10;
            digits++;
        }
        return digits;
    }

    public static int evenFigureCount(int number) {
        int even_number_count = 0;
        if (number == 0) {
            even_number_count = 1;
        }
        while (number != 0) {
            if (number % 2 == 0) {
                even_number_count++;
            }
            number = number / 10;
        }
        return even_number_count;
    }

    public static int oddFigureCount (int number){
        return figureCount(number) - evenFigureCount(number);
    }

    public static int factorial (int number){
        int count = number;
        int result = 1;
        while (count != 0){
            result = result*count;
            count--;
        }
        return result;
    }

    public static int factorialRecursive (int recursive_factorial_number){
        return factorial(recursive_factorial_number);
    }

    public static int quadraticEcuationSolutions (int a, int b, int c){
        int discriminate = b * 2 - 4 * a *c;
        int solution = 0;
        if (discriminate > 0){
            solution = 2;
        } else if (discriminate == 0){
            solution = 1;
        } else if (discriminate < 0){
            solution = 0;
        }
        return solution;
    }

    public static int figuresSumatory(int number){
        int result = 0;
        if (number == 1 ){
            result = 1;
        } else {
            result = number + figuresSumatory(number - 1);
        }
        return result;
    }
}
