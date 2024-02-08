package POO_3.Ejercicio3;

public class Circulo extends Figura2D{
    public double diameter;
    public double radius;

    public Circulo(double diameter, double radius) {
        this.diameter = diameter;
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeterFigure() {
        return Math.PI * diameter;
    }
}
