package POO_3.Ejercicio4;
public class Libro extends Ficha{
    public String author;
    public String editorial;
    public Libro(int number, String title, String author, String editorial) {
        super(number, title);
        this.author = author;
        this.editorial = editorial;
    }
    public String toString(){
        return "Titulo: " + title +
                "\nAutor: " + author +
                "\nEditorial: "+editorial+
                "\nNumero: " + number;
    }
}
