package POO_3.Ejercicio3;

public abstract class Figura2D {

    public abstract double areaFigure();
    public abstract double perimeterFigure();
    public  String toString(){
        return "Area: " + areaFigure() +
                "\nPerimetro: " + perimeterFigure();
    }
}
