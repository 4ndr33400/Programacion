package POO_3.Ejercicio4;
public class DVD extends Ficha{
    public String director;
    public int yearRelease;
    public String typeMovie;
    public DVD(int number, String title, String director, int yearRelease, String typeMovie) {
        super(number, title);
        this.director = director;
        this.yearRelease = yearRelease;
        this.typeMovie = typeMovie;
    }
    public String toString(){
        return "Titulo: " + title +
                "\nAutor: " + director +
                "\nAño: "+yearRelease+
                "\nGenero: "+typeMovie+
                "\nNumero: " + number;
    }
}
