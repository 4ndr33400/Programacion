package POO_3.Ejercicio3;

public class Cuadrado extends Rectangulo{
    public double sideSquare;

    public Cuadrado(double sideSquare) {
        super(sideSquare,sideSquare);
        this.sideSquare = sideSquare;
    }

    @Override
    public double areaFigure() {
        return sideSquare * sideSquare;
    }

    @Override
    public double perimeterFigure() {
        return sideSquare * 4;
    }
}
