package Tema2;
public class MyMath {
    public static double squarePerimeter(double length_side_square){
        if (length_side_square > 0){
        return length_side_square * 4;
        } else {
            return 0;
        }
    }
    public static double squareArea(double length_side_square){
        if (length_side_square > 0){
            return length_side_square * length_side_square;
        } else {
            return 0;
        }
    }
    public static double rectanglePerimeter (double large_rectangle, double wide_rectangle){
        if (large_rectangle > 0 && wide_rectangle > 0){
            return (2 * large_rectangle) + (2 * wide_rectangle);
        } else {
            return 0;
        }
    }
    public static double rectangleArea (double large_rectangle, double wide_rectangle){
        if (large_rectangle > 0 && wide_rectangle > 0){
            return large_rectangle * wide_rectangle;
        } else {
            return 0;
        }
    }
    public static double circlePerimeter (double circle_radius){
        if (circle_radius > 0){
            return Math.PI* circle_radius;
        } else {
            return 0;
        }
    }
    public static double circleArea(double circle_radius){
        if (circle_radius > 0) {
            return Math.PI * (circle_radius * circle_radius);
        } else {
            return 0;
        }
    }
    public static boolean isPrime (int number_prime) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && contador != number_prime) {
            if (number_prime % contador == 0)
                primo = false;
            contador++;
        }
        return true;
    }
    public static boolean isNotPrime (int number_prime){
        int contador = 2;
        boolean primo = true;
        while ((primo) && contador != number_prime) {
            if (number_prime % contador == 0)
                primo = false;
            contador++;
        }
        return false;
    }
}
