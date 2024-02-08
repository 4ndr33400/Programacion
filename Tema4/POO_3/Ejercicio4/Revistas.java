package POO_3.Ejercicio4;
public class Revistas extends Ficha{
    public int publishNumber;
    public int yearRelease;
    public Revistas(int number, String title, int publishNumber, int yearRelease) {
        super(number, title);
        this.publishNumber = publishNumber;
        this.yearRelease = yearRelease;
    }
    public String toString(){
        return "Titulo: " + title +
                "\nAño: " + yearRelease +
                "\nFecha de publicacion: "+publishNumber+
                "\nNumero: " + number;
    }
}
