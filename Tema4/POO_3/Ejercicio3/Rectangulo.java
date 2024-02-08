package POO_3.Ejercicio3;

public class Rectangulo extends Figura2D {
    public double widthRectangle;
    public double longRectangle;

    public Rectangulo(double widthRectangle, double longRectangle) {
        this.widthRectangle = widthRectangle;
        this.longRectangle = longRectangle;
    }

    @Override
    public double areaFigure() {
        return widthRectangle + longRectangle;
    }

    @Override
    public double perimeterFigure() {
        return areaFigure() * 2;
    }

}
