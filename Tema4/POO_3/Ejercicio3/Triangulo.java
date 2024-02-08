package POO_3.Ejercicio3;

public class Triangulo extends Figura2D{
    public double baseTriangle;
    public double heightTriangle;
    public double sideTriangle1;
    public double sideTriangle2;

    public Triangulo(double baseTriangle, double heightTriangle, double sideTriangle1, double sideTriangle2) {
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
        this.sideTriangle1 = sideTriangle1;
        this.sideTriangle2 = sideTriangle2;
    }

    @Override
    public double areaFigure() {
        return (baseTriangle * heightTriangle)/2;
    }

    @Override
    public double perimeterFigure() {
        return sideTriangle1 + sideTriangle2 + baseTriangle;
    }
}
