package Tema2;
public class MyMath {
    public static double squarePerimeter(double length_side_square) {
        if (length_side_square > 0) {
            return length_side_square * 4;
        } else {
            return 0;
        }
    }

    public static double squareArea(double length_side_square) {
        if (length_side_square > 0) {
            return length_side_square * length_side_square;
        } else {
            return 0;
        }
    }

    public static double rectanglePerimeter(double large_rectangle, double wide_rectangle) {
        if (large_rectangle > 0 && wide_rectangle > 0) {
            return (2 * large_rectangle) + (2 * wide_rectangle);
        } else {
            return 0;
        }
    }

    public static double rectangleArea(double large_rectangle, double wide_rectangle) {
        if (large_rectangle > 0 && wide_rectangle > 0) {
            return large_rectangle * wide_rectangle;
        } else {
            return 0;
        }
    }

    public static double circlePerimeter(double circle_radius) {
        if (circle_radius > 0) {
            return Math.PI * circle_radius;
        } else {
            return 0;
        }
    }

    public static double circleArea(double circle_radius) {
        if (circle_radius > 0) {
            return Math.PI * (circle_radius * circle_radius);
        } else {
            return 0;
        }
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

    public static int evenFigureCount(int even_number) {
        int even_number_count = 0;
        if (even_number == 0) {
            even_number_count = 1;
        }
        while (even_number != 0) {
            if (even_number % 2 == 0) {
                even_number_count++;
            }
            even_number = even_number / 10;
        }
        return even_number_count;
    }
    public static int oddFigureCount (int odd_number){
        int odd_number_count = 0;
        while (odd_number != 0) {
            if (odd_number % 2 != 0) {
                odd_number_count++;
            }
            odd_number = odd_number / 10;
        }
        return odd_number_count;
    }
    public static int factorial (int factorial_number){
        int count = factorial_number;
        int result = 1;
        while (count != 0){
             result = result*count;
            count--;
        }
        return result;
    }
    /*
    public static int factorialRecursive (int recursive_factorial_number){
        int count = recursive_factorial_number;
        int result = 1;
        while (count != 0){
            result = result*factorialRecursive(recursive_factorial_number);
            count--;
        }
        return result;
    }
    */
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

     }
}


